package defpackage;

import com.android.vcard.VCardBuilder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ainh {
    protected static final String b = StandardCharsets.UTF_8.name();
    public aimg e;
    public aimy f;
    public ailt g;
    protected ailu h;
    public aima i;
    public ailw j;
    public byte[] k;
    public final int l;
    public final long c = System.currentTimeMillis();
    public final List d = new ArrayList();
    private final Map a = new HashMap();

    public ainh(int i) {
        this.l = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void w(defpackage.aimh r4, boolean r5, boolean r6) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ainh.w(aimh, boolean, boolean):void");
    }

    private final void x(StringBuffer stringBuffer) {
        synchronized (this.d) {
            for (aimh aimhVar : this.d) {
                if (!(aimhVar instanceof aima)) {
                    stringBuffer.append(aimhVar.c());
                }
            }
        }
    }

    public String a() {
        StringBuffer stringBuffer = new StringBuffer();
        l(stringBuffer);
        return stringBuffer.toString();
    }

    public byte[] b() {
        StringBuffer stringBuffer = new StringBuffer();
        x(stringBuffer);
        byte[] bArr = this.k;
        if (bArr != null) {
            stringBuffer.append("Content-Length: ");
            int length = bArr.length;
            stringBuffer.append(length);
            stringBuffer.append(VCardBuilder.VCARD_END_OF_LINE);
            stringBuffer.append(VCardBuilder.VCARD_END_OF_LINE);
            byte[] bytes = stringBuffer.toString().getBytes(StandardCharsets.UTF_8);
            if (bytes != null) {
                int length2 = bytes.length;
                byte[] bArr2 = new byte[length2 + length];
                System.arraycopy(bytes, 0, bArr2, 0, length2);
                System.arraycopy(bArr, 0, bArr2, length2, length);
                return bArr2;
            }
            return null;
        }
        stringBuffer.append("Content-Length: 0\r\n");
        stringBuffer.append(VCardBuilder.VCARD_END_OF_LINE);
        return stringBuffer.toString().getBytes(StandardCharsets.UTF_8);
    }

    public final aily c() {
        return (aily) e("Contact");
    }

    public final aimh d(String str) {
        if (str != null) {
            aimh aimhVar = (aimh) this.a.get(str.toLowerCase(Locale.US));
            if (aimhVar instanceof aimi) {
                return ((aimi) aimhVar).f();
            }
            return aimhVar;
        }
        throw new IllegalArgumentException("Header name must not be null");
    }

    public final aimi e(String str) {
        aimh aimhVar = (aimh) this.a.get(str.toLowerCase(Locale.US));
        if (aimhVar instanceof aimi) {
            return (aimi) aimhVar;
        }
        if (aimhVar instanceof ainb) {
            return new ainc((ainb) aimhVar);
        }
        if (aimhVar instanceof ailx) {
            return new aily((ailx) aimhVar);
        }
        if (aimhVar == null) {
            if (str.equals("Contact")) {
                return new aily();
            }
            if (str.equals("Via")) {
                return new ainc();
            }
            return new aimi(str);
        }
        return new aimi(aimhVar);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ainh)) {
            return false;
        }
        ainh ainhVar = (ainh) obj;
        if (this.l != ainhVar.l) {
            return false;
        }
        if (ainhVar.d.size() != this.d.size()) {
            return false;
        }
        if ((this.k == null && ainhVar.k != null) || !ainhVar.d.equals(this.d)) {
            return false;
        }
        byte[] bArr = this.k;
        if (bArr != null && !Arrays.equals(bArr, ainhVar.k)) {
            return false;
        }
        return true;
    }

    public final ainb f() {
        ainc g = g();
        if (g == null) {
            return null;
        }
        return (ainb) g.f();
    }

    public final ainc g() {
        return (ainc) e("Via");
    }

    public final String h() {
        ailu ailuVar = this.h;
        if (ailuVar == null) {
            return null;
        }
        return ailuVar.a();
    }

    public int hashCode() {
        int hashCode = ((this.l - 1) * 37) + this.d.hashCode();
        byte[] bArr = this.k;
        if (bArr != null) {
            for (byte b2 : bArr) {
                hashCode = (hashCode * 37) + b2;
            }
        }
        return hashCode;
    }

    public String i() {
        ailt ailtVar = this.g;
        if (ailtVar == null) {
            return null;
        }
        return ailtVar.e();
    }

    public final List j(String str) {
        aimh aimhVar = (aimh) this.a.get(str.toLowerCase(Locale.US));
        if (aimhVar == null) {
            return new ArrayList();
        }
        if (aimhVar instanceof aimi) {
            return ((aimi) aimhVar).a;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(aimhVar);
        return arrayList;
    }

    public final void k(aimh aimhVar) {
        if (aimhVar instanceof ainb) {
            w(aimhVar, false, true);
        } else {
            w(aimhVar, false, false);
        }
    }

    public final void l(StringBuffer stringBuffer) {
        String i;
        x(stringBuffer);
        aima aimaVar = this.i;
        if (aimaVar != null) {
            stringBuffer.append(aimaVar.c());
            stringBuffer.append(VCardBuilder.VCARD_END_OF_LINE);
        }
        if (this.k != null) {
            try {
                aimb aimbVar = (aimb) this.a.get(assi.a.toLowerCase(Locale.US));
                String str = b;
                if (aimbVar != null && (i = aimbVar.i("charset")) != null) {
                    str = i;
                }
                stringBuffer.append(new String(this.k, str));
            } catch (Exception e) {
                advr.q("Error trying to encode message content: %s", e.getMessage());
            }
        }
    }

    public final void m(String str) {
        if (str != null) {
            aimh aimhVar = (aimh) this.a.get(str.toLowerCase(Locale.US));
            if (aimhVar != null) {
                this.a.remove(str.toLowerCase(Locale.US));
                if (aimhVar instanceof aimg) {
                    this.e = null;
                } else if (aimhVar instanceof aimy) {
                    this.f = null;
                } else if (aimhVar instanceof ailt) {
                    this.g = null;
                } else if (aimhVar instanceof ailu) {
                    this.h = null;
                } else if (aimhVar instanceof aima) {
                    this.i = null;
                } else if (aimhVar instanceof ailw) {
                    this.j = null;
                }
                Iterator it = this.d.iterator();
                int i = -1;
                while (it.hasNext()) {
                    i++;
                    if (((aimh) it.next()).c.equalsIgnoreCase(str)) {
                        break;
                    }
                }
                if (i != -1 && i < this.d.size()) {
                    this.d.remove(i);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Header name must not be null");
    }

    public final void n(byte[] bArr) {
        if (bArr != null) {
            aima aimaVar = this.i;
            if (aimaVar != null) {
                aimaVar.b(bArr.length);
            }
            this.k = bArr;
            return;
        }
        throw new IllegalArgumentException("Content must not be null");
    }

    public final void o(byte[] bArr, aimh aimhVar) {
        if (bArr != null) {
            p(aimhVar);
            this.k = bArr;
            aima aimaVar = this.i;
            if (aimaVar != null) {
                aimaVar.b(bArr.length);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Content must not be null");
    }

    public final void p(aimh aimhVar) {
        if (aimhVar != null) {
            if ((aimhVar instanceof aimi) && ((aimi) aimhVar).i()) {
                return;
            }
            m(aimhVar.c);
            w(aimhVar, true, false);
            return;
        }
        throw new IllegalArgumentException("Header must not be null!");
    }

    public final boolean q(String str) {
        return this.a.containsKey(str.toLowerCase(Locale.US));
    }

    public final boolean r() {
        int i = this.l;
        if (i != 3 && i != 4) {
            return false;
        }
        return true;
    }

    public final boolean s() {
        if (this.l == 1) {
            return true;
        }
        return false;
    }

    public final boolean t() {
        if (this.l == 2) {
            return true;
        }
        return false;
    }

    public final String u(int i) {
        String i2 = i();
        if (i2 == null) {
            return null;
        }
        return v(i2, i);
    }

    public final String v(String str, int i) {
        ailu ailuVar;
        String str2;
        ailt ailtVar = this.g;
        if (ailtVar != null && (ailuVar = this.h) != null) {
            String a = ailuVar.a();
            int b2 = ailtVar.b();
            if (i != 1) {
                str2 = "OUTGOING";
            } else {
                str2 = "INCOMING";
            }
            return str2 + "_" + a + "_" + str + "_" + b2;
        }
        return null;
    }
}
