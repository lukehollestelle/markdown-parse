import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testTestFile() throws IOException{
        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(Files.readString(Path.of("test-file.md"))));
    }

    @Test
    public void testBreakFile() throws IOException{
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("break-file.md"))));
    }

    @Test
    public void testBreakFile2() throws IOException{
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("break-file2.md"))));
    }

    @Test
    public void testBreakFile3() throws IOException{
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("break-file3.md"))));
    }
}