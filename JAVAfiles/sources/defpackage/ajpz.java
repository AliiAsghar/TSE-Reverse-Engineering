package defpackage;

import com.android.vcard.VCardBuilder;
import j$.util.Optional;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajpz implements aifc {
    public final alnr a;
    public final alog b;
    public final ajqa c;

    public ajpz() {
        throw null;
    }

    public static asmg e() {
        asmg asmgVar = new asmg((char[]) null);
        asmgVar.z("", "urn:ietf:params:cpim-headers:");
        return asmgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String f() {
        StringBuilder sb = new StringBuilder();
        aluq listIterator = this.a.entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            if (!albo.ah((String) entry.getKey())) {
                sb.append("NS: ");
                sb.append((String) entry.getKey());
                sb.append(" <");
                sb.append((String) entry.getValue());
                sb.append(">\r\n");
            }
        }
        alnr alnrVar = this.a;
        alog alogVar = this.b;
        for (int i = 0; i < ((alsx) alogVar).c; i++) {
            alsw alswVar = ((alsw) alnrVar).d;
            ajqb ajqbVar = (ajqb) alogVar.get(i);
            String str = (String) alswVar.get(ajqbVar.a);
            if (!albo.ah(str)) {
                sb.append(str);
                sb.append('.');
            }
            sb.append(ajqbVar.b);
            sb.append(": ");
            sb.append(ajqbVar.c);
            sb.append(VCardBuilder.VCARD_END_OF_LINE);
        }
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
        return sb.toString();
    }

    @Override // defpackage.aifc
    public final long a() {
        int length = f().length();
        ajqa ajqaVar = this.c;
        return length + ajqaVar.a().length() + ((Long) ajqaVar.c.map(new aiec(20)).orElse(0L)).longValue();
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [aifc, java.lang.Object] */
    @Override // defpackage.aifc
    public final InputStream b() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(f().getBytes(StandardCharsets.UTF_8));
        ajqa ajqaVar = this.c;
        InputStream byteArrayInputStream2 = new ByteArrayInputStream(ajqaVar.a().getBytes(StandardCharsets.UTF_8));
        if (ajqaVar.c.isPresent()) {
            byteArrayInputStream2 = new SequenceInputStream(byteArrayInputStream2, ajqaVar.c.get().b());
        } else {
            advr.h(ajqa.a, "MessageContent is null, returning only headers stream", new Object[0]);
        }
        return new SequenceInputStream(byteArrayInputStream, byteArrayInputStream2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Optional c(String str) {
        ajqb ajqbVar;
        int i = 0;
        do {
            alog alogVar = this.b;
            if (i < ((alsx) alogVar).c) {
                ajqbVar = (ajqb) alogVar.get(i);
                i++;
            } else {
                return Optional.empty();
            }
        } while (!ajqbVar.b.equals(str));
        return Optional.of(ajqbVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Optional d(String str) {
        int i = 0;
        while (true) {
            alog alogVar = this.b;
            if (i < ((alsx) alogVar).c) {
                ajqb ajqbVar = (ajqb) alogVar.get(i);
                if (ajqbVar.b.equals(str) && "urn:ietf:params:imdn".equals(ajqbVar.a)) {
                    return Optional.of(ajqbVar);
                }
                i++;
            } else {
                return Optional.empty();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajpz) {
            ajpz ajpzVar = (ajpz) obj;
            if (alzz.am(this.a, ajpzVar.a) && alzz.at(this.b, ajpzVar.b) && this.c.equals(ajpzVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ajqa ajqaVar = this.c;
        alog alogVar = this.b;
        return "CpimMessage{namespaces=" + String.valueOf(this.a) + ", headers=" + String.valueOf(alogVar) + ", content=" + String.valueOf(ajqaVar) + "}";
    }

    public ajpz(alnr alnrVar, alog alogVar, ajqa ajqaVar) {
        this.a = alnrVar;
        this.b = alogVar;
        this.c = ajqaVar;
    }
}
