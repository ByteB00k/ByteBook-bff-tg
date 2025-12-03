package com.bytebook.bfftg.config;

import com.bytebook.bfftg.keyboard.InlineKeyboardButton;
import com.bytebook.bfftg.keyboard.InlineKeyboardMarkup;
import com.bytebook.bfftg.keyboard.KeyboardButton;
import com.bytebook.bfftg.keyboard.ReplyKeyboardMarkup;
import com.bytebook.bfftg.models.update.CallbackQueryBff;
import com.bytebook.bfftg.models.update.MessageBff;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class JacksonConfigTest {

        @Autowired
        private ObjectMapper objectMapper;


        @Test
        void testMessageDeserialization() throws Exception {
            String json = """
                {
                  "message_id": 123,
                  "text": "Hello",
                  "unknownField": "ignored"
                }
                """;

            MessageBff message = objectMapper.readValue(json, MessageBff.class);
            assertEquals(Long.valueOf(123), message.getMessage_id());
            assertEquals("Hello", message.getText());
        }

        @Test
        void testCallbackQueryDeserialization() throws Exception {
            String json = """
                {
                  "id": "callback_1",
                  "data": "some_data",
                  "message": {"message_id": 1, "text": "Hi"},
                  "extraField": "ignored"
                }
                 """;

            CallbackQueryBff callbackQueryBff = objectMapper.readValue(json, CallbackQueryBff.class);
            assertEquals("callback_1", callbackQueryBff.getId());
            assertEquals("some_data", callbackQueryBff.getData());
            assertNotNull(callbackQueryBff.getMessage());
            assertEquals(1, callbackQueryBff.getMessage().getMessage_id());
        }

        @Test
        void testInlineKeyboardSerializationOmitsNulls() throws Exception {
            InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
            keyboard.setInlineKeyboard(List.of(List.of(new InlineKeyboardButton(), new InlineKeyboardButton())));

            String serialized = objectMapper.writeValueAsString(keyboard);
            assertFalse(serialized.contains("null"), "Serialized JSON should not contain null values");
        }

        @Test
        void testReplyKeyboardSerializationOmitsNulls() throws Exception {
            ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
            keyboard.setKeyboard(List.of(
                    List.of(new KeyboardButton("A"), new KeyboardButton(null))
            ));

            String serialized = objectMapper.writeValueAsString(keyboard);
            assertFalse(serialized.contains("null"), "Serialized JSON should not contain null values");
        }
}

