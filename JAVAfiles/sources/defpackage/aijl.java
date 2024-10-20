package defpackage;

import android.text.TextUtils;
import com.android.vcard.VCardBuilder;
import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aijl extends aijf {
    private final String b;
    private final BigInteger c;
    private final long d;

    public aijl(String str, aijk aijkVar, aijd aijdVar, String str2) {
        super(aijkVar, aijdVar, str2);
        this.b = str;
        long currentTimeMillis = (System.currentTimeMillis() / 1000) + 2208988800L;
        this.c = BigInteger.valueOf(currentTimeMillis);
        this.d = currentTimeMillis;
    }

    public static aijl e(String str) {
        String o = ahji.o(str, "o=");
        String[] split = o.split(" ");
        if (split.length == 6) {
            String str2 = split[0];
            String replace = split[1].replace(".", "");
            try {
                BigInteger bigInteger = new BigInteger(replace);
                String replace2 = split[2].replace(".", "");
                try {
                    long parseLong = Long.parseLong(replace2);
                    String str3 = split[3];
                    return new aijl(str2, bigInteger, parseLong, aijk.a, aijd.b(split[4]), split[5]);
                } catch (NumberFormatException e) {
                    throw new aijn("Invalid SDP format, numerical expected: ".concat(String.valueOf(replace2)), e);
                }
            } catch (NumberFormatException e2) {
                throw new aijn("Invalid SDP format, numerical expected: ".concat(String.valueOf(replace)), e2);
            }
        }
        throw new aijn("Illegal format for origin: ".concat(String.valueOf(o)));
    }

    @Override // defpackage.aijf, defpackage.aijm
    public final void b(StringBuilder sb) {
        sb.append("o=");
        sb.append(this.b);
        sb.append(" ");
        sb.append(this.c.toString());
        sb.append(" ");
        sb.append(this.d);
        sb.append(" ");
        d(sb);
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
    }

    @Override // defpackage.aijf
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof aijl)) {
            return false;
        }
        aijl aijlVar = (aijl) obj;
        if (!this.c.equals(aijlVar.c) || !TextUtils.equals(this.b, aijlVar.b) || !super.c(aijlVar) || this.d != aijlVar.d) {
            return false;
        }
        return true;
    }

    @Override // defpackage.aijf
    public final int hashCode() {
        int hashCode = (((super.hashCode() * 37) + this.c.intValue()) * 37) + ((int) this.d);
        if (!TextUtils.isEmpty(this.b)) {
            return (hashCode * 37) + this.b.hashCode();
        }
        return hashCode;
    }

    protected aijl(String str, BigInteger bigInteger, long j, aijk aijkVar, aijd aijdVar, String str2) {
        super(aijkVar, aijdVar, str2);
        this.b = str;
        this.c = bigInteger;
        this.d = j;
    }
}
