package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyj {
    public boolean a;
    public final Bundle b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    private final IconCompat g;
    private final CharSequence h;
    private final PendingIntent i;
    private ArrayList j;

    public dyj(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i != 0 ? IconCompat.h(null, "", i) : null, charSequence, pendingIntent, new Bundle());
    }

    public final dyk a() {
        dzw[] dzwVarArr;
        CharSequence[] charSequenceArr;
        if (!this.e || this.i != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = this.j;
            if (arrayList3 != null) {
                int size = arrayList3.size();
                for (int i = 0; i < size; i++) {
                    dzw dzwVar = (dzw) arrayList3.get(i);
                    if (!dzwVar.d && (((charSequenceArr = dzwVar.c) == null || charSequenceArr.length == 0) && !dzwVar.g.isEmpty())) {
                        arrayList.add(dzwVar);
                    } else {
                        arrayList2.add(dzwVar);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
            }
            if (arrayList2.isEmpty()) {
                dzwVarArr = null;
            } else {
                dzwVarArr = (dzw[]) arrayList2.toArray(new dzw[arrayList2.size()]);
            }
            return new dyk(this.g, this.h, this.i, this.b, dzwVarArr, this.a, this.c, this.d, this.e, this.f);
        }
        throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
    }

    public final void b(Bundle bundle) {
        if (bundle != null) {
            this.b.putAll(bundle);
        }
    }

    public final void c(dzw dzwVar) {
        if (this.j == null) {
            this.j = new ArrayList();
        }
        if (dzwVar != null) {
            this.j.add(dzwVar);
        }
    }

    public dyj(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        this(iconCompat, charSequence, pendingIntent, new Bundle());
    }

    private dyj(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        this.a = true;
        this.d = true;
        this.g = iconCompat;
        this.h = dyu.c(charSequence);
        this.i = pendingIntent;
        this.b = bundle;
        this.j = null;
        this.a = true;
        this.c = 0;
        this.d = true;
        this.e = false;
        this.f = false;
    }
}
