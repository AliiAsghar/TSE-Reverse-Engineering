package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aoio implements abik {
    private final /* synthetic */ int a;

    /* JADX WARN: Type inference failed for: r0v2, types: [aoga, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.abik
    public final Object a(Object obj) {
        aogi aogiVar;
        aoga aogaVar;
        if (this.a != 0) {
            return ((amob) obj).toByteArray();
        }
        aojh aojhVar = (aojh) obj;
        asqe asqeVar = hzg.a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            aogiVar = new aogi(byteArrayOutputStream, asqeVar.b, asqeVar.c, asqeVar.a);
            aogaVar = (aoga) aogiVar.c.get(aojhVar.getClass());
        } catch (IOException unused) {
        }
        if (aogaVar != null) {
            aogaVar.a(aojhVar, aogiVar);
            return byteArrayOutputStream.toByteArray();
        }
        throw new aofy("No encoder for ".concat(String.valueOf(String.valueOf(aojhVar.getClass()))));
    }
}
