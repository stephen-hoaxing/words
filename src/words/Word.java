package words;

public class Word {

    private String word;
    private long length;

    public Word() {
    }

    public Word(String word, long length) {
        this.word = word;
        this.length = length;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }
}
