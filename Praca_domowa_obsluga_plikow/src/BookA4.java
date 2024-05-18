import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class BookA4 extends AbstractBook {
    private static final int CHARACTERS_PER_PAGE = 4972;

    public BookA4(String filePath) {
        super(filePath);
    }

    @Override
    public String page(int pageNumber) throws IOException {
        if (pageNumber <= 0)
            return "";

        int startCharIndex = (pageNumber - 1) * CHARACTERS_PER_PAGE;
        int endCharIndex = pageNumber * CHARACTERS_PER_PAGE;

        File file = new File(filePath);
        FileReader fileReader = new FileReader(file, StandardCharsets.UTF_8);
        int buffer = fileReader.read();
        int index = 0;
        StringBuilder result = new StringBuilder();

        while (buffer != -1 && index < endCharIndex) {
            char character = (char) buffer;
            if (index >= startCharIndex)
                result.append(character);
            buffer = fileReader.read();
            index++;
        }

        fileReader.close();
        return result.toString();
    }
}
