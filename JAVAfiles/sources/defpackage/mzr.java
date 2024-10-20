package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mzr {
    Object a;
    public Object b;

    public final mxu a() {
        Object obj;
        Object obj2 = this.a;
        if (obj2 != null && (obj = this.b) != null) {
            return new mxu((String) obj2, (alog) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" text");
        }
        if (this.b == null) {
            sb.append(" annotations");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(alog alogVar) {
        if (alogVar != null) {
            this.b = alogVar;
            return;
        }
        throw new NullPointerException("Null annotations");
    }

    public final void c(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null text");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    public final mgo d() {
        Object obj;
        ?? r0 = this.b;
        if (r0 != 0 && (obj = this.a) != null) {
            return new mgo(r0, (amlg) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" messageSnapshot");
        }
        if (this.a == null) {
            sb.append(" outgoingMessageFailureReason");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void e(MessageCoreData messageCoreData) {
        if (messageCoreData != null) {
            this.b = messageCoreData;
            return;
        }
        throw new NullPointerException("Null messageSnapshot");
    }

    public final void f(amlg amlgVar) {
        if (amlgVar != null) {
            this.a = amlgVar;
            return;
        }
        throw new NullPointerException("Null outgoingMessageFailureReason");
    }
}
