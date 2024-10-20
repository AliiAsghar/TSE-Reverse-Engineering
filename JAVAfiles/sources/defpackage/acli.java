package defpackage;

import android.net.Uri;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acli implements ackc {
    private final Uri a;
    private final byte[] b;
    private final Map c;

    /* JADX WARN: Multi-variable type inference failed */
    public acli(ackc ackcVar) {
        this.a = ackcVar.a();
        this.b = ((abtp) ackcVar).gq();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : ackcVar.b().entrySet()) {
            if (entry.getKey() != null) {
                hashMap.put((String) entry.getKey(), (ackd) ((ackd) entry.getValue()).d());
            }
        }
        this.c = DesugarCollections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.ackc
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.ackc
    public final Map b() {
        return this.c;
    }

    @Override // defpackage.ackc
    public final byte[] c() {
        return this.b;
    }

    public final String toString() {
        Object valueOf;
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemEntity{ ");
        sb.append("uri=".concat(String.valueOf(String.valueOf(this.a))));
        byte[] bArr = this.b;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        sb.append(", dataSz=".concat(valueOf.toString()));
        sb.append(", numAssets=" + this.c.size());
        if (isLoggable && !this.c.isEmpty()) {
            sb.append(", assets=[");
            String str = "";
            for (Map.Entry entry : this.c.entrySet()) {
                sb.append(str + ((String) entry.getKey()) + ": " + ((ackd) entry.getValue()).f());
                str = ", ";
            }
            sb.append("]");
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // defpackage.abtr
    public final /* bridge */ /* synthetic */ Object d() {
        return this;
    }
}
