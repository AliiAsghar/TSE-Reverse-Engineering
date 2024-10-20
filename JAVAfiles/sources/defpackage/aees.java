package defpackage;

import com.google.android.libraries.abuse.hades.tartarus.runtime.Data;
import com.google.android.libraries.abuse.hades.tartarus.runtime.TartarusKt;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aees implements arqr {
    public final aefe a;
    private final aefg b;

    public aees(aefe aefeVar, aefg aefgVar) {
        this.a = aefeVar;
        this.b = aefgVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Data data = (Data) obj;
        data.getClass();
        int i = aeff.a;
        Data data2 = new Data();
        ByteBuffer byteBuffer = this.a.a;
        aefg aefgVar = this.b;
        TartarusKt.runScarBlobs(byteBuffer, 1, aefgVar.a, aefgVar.b, aefgVar.c, aefgVar.d, data, data2);
        return data2;
    }
}
