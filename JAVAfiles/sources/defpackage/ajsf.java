package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajsf {
    public final ContentType a;
    public final Class b;
    private final Supplier c;

    public ajsf() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ajsf a(ContentType contentType, Class cls, Supplier supplier) {
        if (contentType != null) {
            return new ajsf(contentType, cls, supplier);
        }
        throw new NullPointerException("Null contentType");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ajsi b() {
        Object obj;
        obj = this.c.get();
        return (ajsi) obj;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajsf) {
            ajsf ajsfVar = (ajsf) obj;
            if (this.a.equals(ajsfVar.a) && this.b.equals(ajsfVar.b)) {
                equals = this.c.equals(ajsfVar.c);
                if (equals) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        hashCode = this.c.hashCode();
        return (hashCode2 * 1000003) ^ hashCode;
    }

    public final String toString() {
        Supplier supplier = this.c;
        Class cls = this.b;
        return "Configuration{contentType=" + String.valueOf(this.a) + ", messageType=" + String.valueOf(cls) + ", factory=" + String.valueOf(supplier) + "}";
    }

    public ajsf(ContentType contentType, Class cls, Supplier supplier) {
        this.a = contentType;
        this.b = cls;
        this.c = supplier;
    }
}
