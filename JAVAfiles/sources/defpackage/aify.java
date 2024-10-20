package defpackage;

import j$.util.Map;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aify implements aipm {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aify(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.aipm
    public final /* synthetic */ Class a() {
        int i = this.b;
        if (i == 0 || i == 1 || i == 2 || i != 3) {
            return IOException.class;
        }
        return IOException.class;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [aipb, java.lang.Object] */
    @Override // defpackage.aipm
    public final Object b() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        this.a.a();
                        return null;
                    }
                    aifj aifjVar = (aifj) this.a;
                    return aifjVar.a(aifjVar.a.accept());
                }
                Object obj = this.a;
                aifm aifmVar = (aifm) obj;
                return (InputStream) Map.EL.computeIfAbsent(aifmVar.b, aifmVar.a.getInputStream(), new agoq(obj, 6));
            }
            return ((aifr) this.a).a();
        }
        Object obj2 = this.a;
        aifm aifmVar2 = (aifm) obj2;
        return (OutputStream) Map.EL.computeIfAbsent(aifmVar2.c, aifmVar2.a.getOutputStream(), new agoq(obj2, 7));
    }
}
