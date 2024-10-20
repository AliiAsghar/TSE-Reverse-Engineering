package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axs {
    public static final void a(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            aju.c(a.cl(i2, i, "both minLines ", " and maxLines ", " must be greater than zero"));
        }
        if (i <= i2) {
            return;
        }
        aju.c("minLines 1 must be less than or equal to maxLines 0");
    }
}
