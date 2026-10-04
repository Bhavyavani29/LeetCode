class Solution {
    public int calPoints(String[] operations) {
        List<Integer> record = new ArrayList<>();
        for (String op : operations) {
            if (op.equals("+")) {
                int size = record.size();
                int newScore = record.get(size - 1) + record.get(size - 2);
                record.add(newScore);
            } 
            else if (op.equals("D")) {
                int newScore = record.get(record.size() - 1) * 2;
                record.add(newScore);
            } 
            else if (op.equals("C")) {
                record.remove(record.size() - 1);
            } 
            else {
                record.add(Integer.parseInt(op));
            }
        }
        int totalSum = 0;
        for (int score : record) {
            totalSum += score;
        } 
        return totalSum;
    }
}