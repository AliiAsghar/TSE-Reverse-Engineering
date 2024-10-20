package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgv {
    public final int a;

    public /* synthetic */ dgv(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof dgv) && this.a == ((dgv) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        if (a.bA(i, 0)) {
            return "Button";
        }
        if (a.bA(i, 1)) {
            return "Checkbox";
        }
        if (a.bA(i, 2)) {
            return "Switch";
        }
        if (a.bA(i, 3)) {
            return "RadioButton";
        }
        if (a.bA(i, 4)) {
            return "Tab";
        }
        if (a.bA(i, 5)) {
            return "Image";
        }
        if (a.bA(i, 6)) {
            return "DropdownList";
        }
        if (a.bA(i, 7)) {
            return "Picker";
        }
        if (a.bA(i, 8)) {
            return "Carousel";
        }
        return "Unknown";
    }
}
