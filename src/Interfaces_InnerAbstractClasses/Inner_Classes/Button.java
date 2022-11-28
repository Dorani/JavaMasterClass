package Interfaces_InnerAbstractClasses.Inner_Classes;

public class Button {
    private String title;
    private OnClickListener onClickListener;

    public String getTitle() {
        return title;
    }

    public Button(String title) {
        this.title = title;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void onClick() {
        this.onClickListener.onClick(this.title);
    }

    public interface OnClickListener {
        public void onClick(String title);
    }
}
