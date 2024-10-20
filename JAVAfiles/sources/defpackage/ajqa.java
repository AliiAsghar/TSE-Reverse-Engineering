package defpackage;

import com.android.vcard.VCardBuilder;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajqa {
    public static final advp a = new advp("CpimMessageContent");
    public final aozb b;
    public final Optional c;
    private final alog d;

    public ajqa() {
        throw null;
    }

    public static anjs c() {
        anjs anjsVar = new anjs((byte[]) null, (byte[]) null);
        anjsVar.g(aozb.b);
        return anjsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            alog alogVar = this.d;
            if (i < ((alsx) alogVar).c) {
                sb.append((String) alogVar.get(i));
                sb.append(": ");
                sb.append((String) this.d.get(i + 1));
                sb.append(VCardBuilder.VCARD_END_OF_LINE);
                i += 2;
            } else {
                sb.append(VCardBuilder.VCARD_END_OF_LINE);
                return sb.toString();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Optional b() {
        boolean z;
        int i = 0;
        if (((alsx) this.d).c % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "No even number of headers entries!");
        while (true) {
            alog alogVar = this.d;
            if (i < ((alsx) alogVar).c) {
                if (albo.ar((CharSequence) alogVar.get(i), assi.a)) {
                    return Optional.of((String) this.d.get(i + 1));
                }
                i += 2;
            } else {
                return Optional.empty();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajqa) {
            ajqa ajqaVar = (ajqa) obj;
            if (alzz.at(this.d, ajqaVar.d) && this.b.equals(ajqaVar.b) && this.c.equals(ajqaVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.c;
        aozb aozbVar = this.b;
        return "CpimMessageContent{headers=" + String.valueOf(this.d) + ", content=" + String.valueOf(aozbVar) + ", messageContent=" + String.valueOf(optional) + "}";
    }

    public ajqa(alog alogVar, aozb aozbVar, Optional optional) {
        this.d = alogVar;
        this.b = aozbVar;
        this.c = optional;
    }
}
