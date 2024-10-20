package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mtd {
    final /* synthetic */ lhm a;
    private final alog b;
    private final alog c;

    public mtd(lhm lhmVar, alog alogVar, alog alogVar2) {
        this.a = lhmVar;
        this.b = alogVar;
        this.c = alogVar2;
    }

    private final void a(StringBuilder sb, alog alogVar, int i) {
        sb.append('\n');
        sb.append(((Context) this.a.k).getString(i));
        int size = alogVar.size();
        if (size != 0) {
            if (size != 1) {
                sb.append(aqjn.aK(alogVar, "\n  ", "\n  ", null, null, 60));
            } else {
                sb.append(aqjn.ag(alogVar));
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        a(sb, this.b, R.string.received_label);
        a(sb, this.c, R.string.read_by_label);
        return sb.toString();
    }
}
