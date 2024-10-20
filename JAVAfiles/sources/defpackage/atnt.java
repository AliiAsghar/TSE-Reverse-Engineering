package defpackage;

import com.android.vcard.VCardConstants;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class atnt extends atma {
    public final HashMap f;

    public atnt() {
        super("Type", 2);
        f(VCardConstants.PARAM_TYPE);
        this.f = new HashMap();
    }

    @Override // defpackage.atma
    public final void a(int i) {
        atnu.b(i);
    }

    public final void g(int i, String str, atmx atmxVar) {
        super.d(i, str);
        this.f.put(atma.b(i), atmxVar);
    }
}
