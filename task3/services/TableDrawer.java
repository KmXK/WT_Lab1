package task3.services;

import java.util.LinkedList;
import java.util.List;

public class TableDrawer {
    public static final int MaxColumnsCount = 10;

    private List<String[]> rows;
    private int columnsCount;

    public TableDrawer(int columnsCount) {
        if(columnsCount <= 0) throw new IllegalArgumentException("Columns count cannot be less than or equal to zero.");
        if(columnsCount > MaxColumnsCount)
            throw new IllegalArgumentException(
                    String.format("Columns count cannot be more than %d", MaxColumnsCount)
            );

        this.rows = new LinkedList<>();

        this.columnsCount = columnsCount;
    }

    public void addRow(Object[] values) {
        if (values == null) throw new NullPointerException("Values cannot be null.");
        if (values.length < columnsCount)
            throw new IllegalArgumentException("Values length cannot be less than columns count.");

        var row = new String[columnsCount];
        for (var i = 0; i < columnsCount; i++) {
            row[i] = values[i].toString();
        }

        this.rows.add(row);
    }

    @Override
    public String toString() {
        var maxLengths = new int[columnsCount];

        for (var i = 0; i < columnsCount; i++) {
            for (var row : rows) {
                maxLengths[i] = Math.max(maxLengths[i], row[i].length());
            }
        }

        var builder = new StringBuilder(columnsCount * 6);

        for (var i = 0; i < columnsCount; i++) {
            if(i == 0) {
                builder.append("║");
            }
            builder.append(" ");

            if(i < columnsCount - 1)
                builder.append(String.format("%%-%ds", maxLengths[i]));
            else
                builder.append(String.format("%%%ds", maxLengths[i]));

            builder.append(" ║");
        }

        var format = builder.toString();

        builder.setLength(0);

        var rowExample = String.format(format, (Object[]) rows.get(0));

        for (var i = 0; i < rowExample.length(); i++) {
            if(rowExample.charAt(i) == '║') {
                builder.append("╬");
            }
            else {
                builder.append("═");
            }
        }

        builder.setCharAt(0, '║');
        builder.setCharAt(rowExample.length() - 1, '║');
        var insideBorder = builder.toString();

        builder.setCharAt(0, '╔');
        builder.setCharAt(insideBorder.length() - 1, '╗');
        for (var i = 0; i < builder.length(); i++) {
            if(builder.charAt(i) == '╬') {
                builder.setCharAt(i, '╦');
            }
        }
        var upBorder = builder.toString();

        builder.setCharAt(0, '╚');
        builder.setCharAt(insideBorder.length() - 1, '╝');
        for (var i = 0; i < builder.length(); i++) {
            if(builder.charAt(i) == '╦') {
                builder.setCharAt(i, '╩');
            }
        }
        var downBorder = builder.toString();

        builder.setLength(0);

        for (var row : rows) {
            builder.append(upBorder);
            upBorder = insideBorder;
            builder.append("\n");
            builder.append(String.format(format, (Object[]) row));
            builder.append("\n");
        }

        builder.append(downBorder);

        return builder.toString();
    }
}
