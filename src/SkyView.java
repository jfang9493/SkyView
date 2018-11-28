public class SkyView {
    private double[][] view;

    public SkyView (int numRows, int numCols, double[] scanned)
    {
        view = new double[numRows][numCols];
        int x = 0;
        for (int i = 0; i < numRows; i++)
        {
            if(i % 2 == 0)
            {
                for (int j = 0; j < numCols; j++)
                {
                    view[i][j] = scanned[x];
                    x++;
                }
            }
            else
            {
                for (int j = numCols - 1; j >= 0; j--)
                {
                    view[i][j] = scanned[x];
                    x++;
                }
            }
        }
    }
    
    public String buildStr ()
    {
        String str = "";
        for (int i = 0; i < view.length; i++)
        {
            for (int j = 0; j < view[i].length; j++)
            {
                str += view[i][j] + " ";
            }
            str += "\n";
        }
        return str;
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        double total = 0, count = 0;
        for (int i = startRow; i <= endRow; i++)
        {
            for (int j = startCol; j <= endCol; j++)
            {
                total += view[i][j];
                count++;
            }
        }
        return total/count;
    }
}
