package defpackage;

import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adhi extends adhd {
    public adhi(adhw adhwVar) {
        super(adhwVar);
    }

    @Override // defpackage.acyi, defpackage.acyh
    public final String a() {
        return "DisabledState";
    }

    @Override // defpackage.adhd, defpackage.acyi, defpackage.acyh
    public final boolean e(Message message) {
        int i = message.what;
        if (i != 4 && i != 7 && i != 8) {
            return super.e(message);
        }
        return true;
    }
}
