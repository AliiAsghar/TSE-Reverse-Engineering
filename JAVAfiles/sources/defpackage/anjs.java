package defpackage;

import com.google.android.ims.rcsservice.ims.ImsEvent;
import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anjs {
    public int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public anjs() {
        throw null;
    }

    public final anjt a() {
        Object obj;
        int i = this.a;
        if (i != 0 && (obj = this.b) != null) {
            Object obj2 = this.c;
            return new anjt(i, (String) obj, (Optional) obj2, (Optional) this.d, (Optional) this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" severity");
        }
        if (this.b == null) {
            sb.append(" text");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b() {
        this.a = 4;
    }

    public final void c() {
        this.a = 2;
    }

    public final ajqa d() {
        Object obj = this.d;
        if (obj != null) {
            this.c = ((alob) obj).g();
        } else if (this.c == null) {
            int i = alog.d;
            this.c = alsx.a;
        }
        Object obj2 = this.e;
        if (obj2 != null) {
            ajqa ajqaVar = new ajqa((alog) this.c, (aozb) obj2, (Optional) this.b);
            if (ajqaVar.c.isPresent() && !Objects.equals(ajqaVar.b, aozb.b)) {
                throw new IllegalArgumentException("content and messageContent can't be both present.");
            }
            if (Objects.equals(ajqaVar.b, aozb.b) && ajqaVar.c.isEmpty()) {
                throw new IllegalArgumentException("One of content and messageContent should be present.");
            }
            return ajqaVar;
        }
        throw new IllegalStateException("Missing required properties: content");
    }

    public final alob e() {
        if (this.d == null) {
            this.d = new alob();
        }
        return (alob) this.d;
    }

    public final void f(String str, String str2) {
        e().h(str);
        e().h(str2);
    }

    public final void g(aozb aozbVar) {
        if (aozbVar != null) {
            this.e = aozbVar;
            return;
        }
        throw new NullPointerException("Null content");
    }

    public final void h(aifc aifcVar) {
        this.b = Optional.of(aifcVar);
    }

    public final ImsEvent i() {
        ImsEvent imsEvent = new ImsEvent(this.a, 0L);
        imsEvent.a = null;
        imsEvent.b = (String) this.e;
        imsEvent.c = 0;
        imsEvent.e = (String) this.b;
        imsEvent.d = (String) this.c;
        imsEvent.f = (String) this.d;
        return imsEvent;
    }

    public anjs(char[] cArr, byte[] bArr) {
    }

    public anjs(byte[] bArr, byte[] bArr2) {
        this.a = -1;
        this.b = Optional.empty();
    }

    public anjs(byte[] bArr) {
        this.c = Optional.empty();
        this.d = Optional.empty();
        this.e = Optional.empty();
    }
}
