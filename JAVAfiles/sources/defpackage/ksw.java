package defpackage;

import android.text.SpannableString;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksw {
    public Object a;
    public Object b;
    public Object c;
    private Object d;

    public ksw() {
    }

    public final ksy a() {
        Object obj;
        Object obj2 = this.a;
        if (obj2 != null) {
            this.b = ((alob) obj2).g();
        } else if (this.b == null) {
            int i = alog.d;
            this.b = alsx.a;
        }
        Object obj3 = this.d;
        if (obj3 != null && (obj = this.c) != null) {
            return new ksy((alog) this.b, (SpannableString) obj3, (ConversationIdType) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" conversationName");
        }
        if (this.c == null) {
            sb.append(" conversationId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.lang.Iterable] */
    public final void b(ksx ksxVar) {
        if (this.a == null) {
            if (this.b == null) {
                this.a = new alob();
            } else {
                alob alobVar = new alob();
                this.a = alobVar;
                alobVar.j(this.b);
                this.b = null;
            }
        }
        ((alob) this.a).h(ksxVar);
    }

    public final void c(ConversationIdType conversationIdType) {
        if (conversationIdType != null) {
            this.c = conversationIdType;
            return;
        }
        throw new NullPointerException("Null conversationId");
    }

    public final void d(SpannableString spannableString) {
        if (spannableString != null) {
            this.d = spannableString;
            return;
        }
        throw new NullPointerException("Null conversationName");
    }

    public final ksp e() {
        Object obj = this.d;
        if (obj != null) {
            Object obj2 = this.b;
            return new ksp((Optional) obj2, (Optional) this.c, (Optional) this.a, (amek) obj);
        }
        throw new IllegalStateException("Missing required properties: bugleAdvancedFeedbackSource");
    }

    public final void f(amek amekVar) {
        if (amekVar != null) {
            this.d = amekVar;
            return;
        }
        throw new NullPointerException("Null bugleAdvancedFeedbackSource");
    }

    public ksw(byte[] bArr, byte[] bArr2) {
        this.b = Optional.empty();
        this.a = Optional.empty();
    }
}
