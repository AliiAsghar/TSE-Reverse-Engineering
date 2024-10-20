package defpackage;

import java.io.IOException;
import java.io.StringWriter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aood {
    @Deprecated
    public aood() {
    }

    public String a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final aooa b() {
        if (this instanceof aooa) {
            return (aooa) this;
        }
        throw new IllegalStateException("Not a JSON Array: ".concat(toString()));
    }

    public final aoog c() {
        if (this instanceof aoog) {
            return (aoog) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            aorp aorpVar = new aorp(stringWriter);
            aorpVar.d(1);
            aotl.s(this, aorpVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
