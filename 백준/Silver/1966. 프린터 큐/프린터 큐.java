import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int count = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0; i < count; i++){
            Deque<Document> deque = new ArrayDeque<>();

            int[] document = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int documentCount = document[0];
            int resultCount = document[1];
            int result = 1;

            int[] line = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for(int j = 0; j < documentCount; j++){
                if(j == resultCount){
                    deque.add(new Document(line[j], true));
                    continue;
                }
                deque.add(new Document(line[j], false));
            }

            while(!deque.isEmpty()){
                Document cur = deque.poll();

                int max = deque.stream()
                        .map(Document::getPriority)
                        .mapToInt(Integer::intValue)
                        .max()
                        .orElse(0);

                if(cur.getPriority() < max){
                    deque.add(cur);
                    continue;
                }
                if(cur.isFind){
                    System.out.println(result);
                    break;
                }
                result++;
            }
        }
    }

    static class Document {
        private int priority;
        private boolean isFind;

        public Document(final int priority, final boolean isFind) {
            this.priority = priority;
            this.isFind = isFind;
        }

        public int getPriority() {
            return priority;
        }
    }
}
