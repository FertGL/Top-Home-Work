package HW_5_6;

import java.nio.ByteBuffer;

public class Main {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.put((byte) 1);
        buffer.put((byte) 2);
        buffer.flip();
        System.out.print(buffer.get());
        System.out.print(" ");
        System.out.println(buffer.get());

    }
}
