package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aatl extends aatn {
    public aatl(Context context, yjf yjfVar, ContentResolver contentResolver, anen anenVar, rvt rvtVar, abac abacVar) {
        super(context, yjfVar, contentResolver, anenVar, rvtVar, abacVar);
    }

    @Override // defpackage.aatn, defpackage.aatq
    public final int b(int i) {
        if (!this.b.n()) {
            return 2;
        }
        if (i == 0) {
            return 8;
        }
        return 1;
    }

    @Override // defpackage.aatn, defpackage.aatq
    public final int c() {
        return 1;
    }

    @Override // defpackage.aatq
    public final amqh e() {
        return amqh.CAMERA_GALLERY;
    }

    @Override // defpackage.aatq
    public final amqi f() {
        return amqi.COLLAPSED;
    }

    @Override // defpackage.aatn
    public final int i() {
        return 23;
    }

    @Override // defpackage.aatn
    public final int n() {
        return 2;
    }
}
