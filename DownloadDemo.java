class FileDownload extends Thread {
    private String partName;

    FileDownload(String partName) {
        this.partName = partName;
    }

    public void run() {
        try {
            System.out.println(partName + " downloading...");
            Thread.sleep(1000);
            System.out.println(partName + " completed.");
        } catch (InterruptedException e) {
            System.out.println("Download interrupted.");
        }
    }
}

public class DownloadDemo {
    public static void main(String[] args) throws InterruptedException {
        FileDownload part1 = new FileDownload("Part 1");
        FileDownload part2 = new FileDownload("Part 2");

        part1.start();
        part1.join();
        part2.start();
        part2.join();

        System.out.println("File download completed.");
    }
}
