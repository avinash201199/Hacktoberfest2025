using System;
using System.Collections.Generic;

class SimpleChatbot
{
    static void Main()
    {
        var responses = new Dictionary<string, string>
        {
            {"hi", "Hello there!"},
            {"how are you", "I'm great, thanks for asking!"},
            {"bye", "Goodbye, friend!"}
        };

        Console.WriteLine("Chatbot ready! Type something:");
        while (true)
        {
            Console.Write("You: ");
            string input = Console.ReadLine().ToLower();
            if (responses.ContainsKey(input))
                Console.WriteLine("Bot: " + responses[input]);
            else if (input == "exit")
                break;
            else
                Console.WriteLine("Bot: I don't understand that yet.");
        }
    }
}
