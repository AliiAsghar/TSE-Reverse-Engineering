package defpackage;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aclj extends abtp implements ackc {
    private final int c;

    public aclj(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.c = i2;
    }

    @Override // defpackage.ackc
    public final Uri a() {
        return Uri.parse(gp("path"));
    }

    @Override // defpackage.ackc
    public final Map b() {
        HashMap hashMap = new HashMap(this.c);
        for (int i = 0; i < this.c; i++) {
            abtp abtpVar = new abtp(this.a, this.b + i);
            if (abtpVar.e() != null) {
                hashMap.put(abtpVar.e(), abtpVar);
            }
        }
        return hashMap;
    }

    @Override // defpackage.ackc
    public final byte[] c() {
        return gq();
    }

    @Override // defpackage.abtp, defpackage.abtr
    public final /* synthetic */ Object d() {
        return new acli(this);
    }

    public final String toString() {
        Object valueOf;
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        byte[] gq = gq();
        Map b = b();
        StringBuilder sb = new StringBuilder("DataItemRef{ ");
        sb.append("uri=".concat(String.valueOf(String.valueOf(a()))));
        if (gq == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(gq.length);
        }
        sb.append(", dataSz=".concat(valueOf.toString()));
        sb.append(", numAssets=" + b.size());
        if (isLoggable && !b.isEmpty()) {
            sb.append(", assets=[");
            String str = "";
            for (Map.Entry entry : b.entrySet()) {
                sb.append(str + ((String) entry.getKey()) + ": " + ((ackd) entry.getValue()).f());
                str = ", ";
            }
            sb.append("]");
        }
        sb.append(" }");
        return sb.toString();
    }
}
