package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xou {
    public Object a;
    public Object b;

    public xou() {
        throw null;
    }

    public final xov a() {
        return new xov((Optional) this.a, (Optional) this.b);
    }

    public final void b(xow xowVar) {
        this.b = Optional.of(xowVar);
    }

    public final void c(MessageCoreData messageCoreData) {
        this.a = Optional.of(messageCoreData);
    }

    public final xdr d() {
        Object obj = this.a;
        if (obj != null) {
            return new xdr((Optional) this.b, (amja) obj);
        }
        throw new IllegalStateException("Missing required properties: capabilityLookup");
    }

    public final void e(amja amjaVar) {
        if (amjaVar != null) {
            this.a = amjaVar;
            return;
        }
        throw new NullPointerException("Null capabilityLookup");
    }

    public final void f(pto ptoVar) {
        this.b = Optional.of(ptoVar);
    }

    public final vxo g() {
        boolean z;
        if (((Optional) this.b).isPresent() != ((Optional) this.a).isPresent()) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "Either RcsGroupTelephonyData or ParseError must be present.");
        return new vxo((Optional) this.b, (Optional) this.a);
    }

    public final void h(vxn vxnVar) {
        this.a = Optional.of(vxnVar);
    }

    public final uvm i() {
        Object obj;
        Object obj2 = this.b;
        if (obj2 != null && (obj = this.a) != null) {
            return new uvm((String) obj2, (String) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" psdKey");
        }
        if (this.a == null) {
            sb.append(" psdValue");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void j(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null psdKey");
    }

    public final void k(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null psdValue");
    }

    public xou(byte[] bArr, char[] cArr) {
        this.b = rvc.a;
        this.a = rve.a;
    }

    public xou(short[] sArr) {
    }

    public xou(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = Optional.empty();
        this.a = Optional.empty();
    }

    public xou(byte[] bArr, byte[] bArr2) {
        this.b = Optional.empty();
    }

    public xou(xdr xdrVar) {
        this.b = Optional.empty();
        this.b = xdrVar.a;
        this.a = xdrVar.b;
    }

    public xou(byte[] bArr) {
        this.a = Optional.empty();
        this.b = Optional.empty();
    }
}
