package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ns {
    public int a;
    public int b;
    public int c;
    public int d;

    public final void a(oo ooVar) {
        View view = ooVar.a;
        this.a = view.getLeft();
        this.b = view.getTop();
        this.c = view.getRight();
        this.d = view.getBottom();
    }
}
