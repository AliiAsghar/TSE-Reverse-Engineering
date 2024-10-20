package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ajbd implements View.OnClickListener {
    public final /* synthetic */ View[] a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public ajbd(agry agryVar, View[] viewArr, List list, int i, int i2) {
        this.e = i2;
        this.a = viewArr;
        this.b = list;
        this.c = i;
        this.d = agryVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.e != 0) {
            int i = 0;
            while (true) {
                View[] viewArr = this.a;
                if (i < viewArr.length) {
                    View view2 = viewArr[i];
                    view2.setOnClickListener(null);
                    view2.setClickable(false);
                    i++;
                } else {
                    agrn.c().b().b = true;
                    view.postOnAnimationDelayed(new wob(this, this.b, this.c, 9), 200L);
                    return;
                }
            }
        } else {
            int i2 = 0;
            while (true) {
                View[] viewArr2 = this.a;
                if (i2 < viewArr2.length) {
                    View view3 = viewArr2[i2];
                    view3.setOnClickListener(null);
                    view3.setClickable(false);
                    i2++;
                } else {
                    view.postOnAnimationDelayed(new wob(this.d, this.b, this.c, 11, (byte[]) null), 200L);
                    return;
                }
            }
        }
    }

    public /* synthetic */ ajbd(ajbh ajbhVar, View[] viewArr, List list, int i, int i2) {
        this.e = i2;
        this.d = ajbhVar;
        this.a = viewArr;
        this.b = list;
        this.c = i;
    }
}
