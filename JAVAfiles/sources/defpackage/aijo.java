package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aijo extends aijm {
    public final String a;
    public final String b;

    public aijo(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Pair e(String str) {
        String str2 = null;
        ahji.o(str, null);
        int indexOf = str.indexOf(":");
        if (indexOf < 0) {
            return new Pair(str, null);
        }
        String substring = str.substring(0, indexOf);
        if (indexOf < str.length()) {
            str2 = str.substring(indexOf + 1);
        }
        return new Pair(substring, str2);
    }

    protected String c() {
        return this.a;
    }

    protected String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof aijo)) {
            return false;
        }
        aijo aijoVar = (aijo) obj;
        if (!TextUtils.equals(this.a, aijoVar.c()) || !TextUtils.equals(this.b, aijoVar.d())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g(StringBuilder sb) {
        sb.append(this.a);
        if (!TextUtils.isEmpty(this.b)) {
            sb.append(":");
            sb.append(this.b);
        }
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
    }

    public final int hashCode() {
        int i;
        if (!TextUtils.isEmpty(this.a)) {
            i = this.a.hashCode();
        } else {
            i = 0;
        }
        if (!TextUtils.isEmpty(this.b)) {
            return (i * 37) + this.b.hashCode();
        }
        return i;
    }
}
