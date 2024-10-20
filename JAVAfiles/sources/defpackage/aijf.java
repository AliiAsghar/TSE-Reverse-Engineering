package defpackage;

import android.text.TextUtils;
import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aijf extends aijm {
    public final String a;
    private final aijk b;
    private final aijd c;

    public aijf(aijk aijkVar, aijd aijdVar, String str) {
        if (aijkVar != null) {
            if (aijdVar != null) {
                if (str != null) {
                    this.b = aijkVar;
                    this.c = aijdVar;
                    this.a = str;
                    return;
                }
                throw new IllegalArgumentException("Address must not be null");
            }
            throw new IllegalArgumentException("Address type must not be null");
        }
        throw new IllegalArgumentException("Network type must not be null");
    }

    public static aijf a(String str) {
        String o = ahji.o(str, "c=");
        String[] split = o.split(" ");
        if (split.length == 3) {
            String str2 = split[0];
            return new aijf(aijk.a, aijd.b(split[1]), split[2]);
        }
        throw new aijn("Illegal format for connection info: ".concat(String.valueOf(o)));
    }

    @Override // defpackage.aijm
    public void b(StringBuilder sb) {
        sb.append("c=");
        d(sb);
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean c(aijf aijfVar) {
        if (this.c != aijfVar.c || this.b != aijfVar.b || !TextUtils.equals(this.a, aijfVar.a)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(StringBuilder sb) {
        sb.append(this.b);
        sb.append(" ");
        sb.append(this.c);
        sb.append(" ");
        sb.append(this.a);
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == aijf.class) {
            return c((aijf) obj);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.b.hashCode() * 37) + this.c.hashCode();
        if (!TextUtils.isEmpty(this.a)) {
            return (hashCode * 37) + this.a.hashCode();
        }
        return hashCode;
    }
}
