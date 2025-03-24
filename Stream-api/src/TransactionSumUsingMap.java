import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Q. Given a list of transactions, find the sum of transaction amounts for each day using Java streams:
public class TransactionSumUsingMap {
    public static void main(String[] args) {
        List<Transaction> transactions = List.of(
                new Transaction("2022-01-01", 100),
                new Transaction("2022-01-01", 200),
                new Transaction("2022-01-02", 300),
                new Transaction("2022-01-02", 400),
                new Transaction("2022-01-03", 500)
        );

        Map<String, Integer> sumByDay = transactions
                .stream()
                .collect(Collectors.groupingBy(s->s.getDate(),
                        Collectors.summingInt(p->p.getAmt())));
        sumByDay.forEach((a,b)-> System.out.println(a + " "+ b));
    }

     static class Transaction {
        String date;
        int amt;

        public Transaction(String date, int amt) {
            this.date = date;
            this.amt = amt;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public Integer getAmt() {
            return amt;
        }

        public void setAmt(int amt) {
            this.amt = amt;
        }
    }
}
