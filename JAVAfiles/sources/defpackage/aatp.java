package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aatp extends aatn {
    public aatp(Context context, yjf yjfVar, ContentResolver contentResolver, anen anenVar, rvt rvtVar, abac abacVar) {
        super(context, yjfVar, contentResolver, anenVar, rvtVar, abacVar);
    }

    @Override // defpackage.aatn, defpackage.aatq
    public final int b(int i) {
        if (i == 0 && this.e) {
            return 12;
        }
        if (!this.b.n()) {
            return 2;
        }
        return 1;
    }

    @Override // defpackage.aatn, defpackage.aatq
    public final int c() {
        return (this.e ? 1 : 0) + (!this.b.n() ? 1 : 0);
    }

    @Override // defpackage.aatq
    public final amqh e() {
        return amqh.GALLERY;
    }

    @Override // defpackage.aatq
    public final amqi f() {
        return amqi.COLLAPSED;
    }

    @Override // defpackage.aatn
    public final int i() {
        return 12;
    }
}
