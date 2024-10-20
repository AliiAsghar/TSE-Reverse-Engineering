package defpackage;

import android.text.TextUtils;
import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aijp extends aijm {
    private final String a;

    /* JADX INFO: Access modifiers changed from: protected */
    public aijp(String str) {
        this.a = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(StringBuilder sb) {
        sb.append(this.a);
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof aijp) || !TextUtils.equals(this.a, ((aijp) obj).a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
