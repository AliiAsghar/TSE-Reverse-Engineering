package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ahxq implements aciq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ahxq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v19, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Collection, java.lang.Object] */
    @Override // defpackage.aciq
    public final acir a(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    acit acitVar = new acit();
                    acitVar.b(new aibm(((adef) ((atsg) this.a).b).g((aowr) obj)));
                    return (acir) acitVar.a;
                }
                aoxd aoxdVar = (aoxd) obj;
                acit acitVar2 = new acit();
                apax apaxVar = aoxdVar.b;
                apax apaxVar2 = aoxdVar.c;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator<E> it = apaxVar.iterator();
                while (it.hasNext()) {
                    Object obj2 = this.a;
                    arrayList.add(((adef) ((atsg) obj2).b).g((aowr) it.next()));
                }
                Iterator<E> it2 = apaxVar2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(ahnz.b((aowx) it2.next()));
                }
                ajur ajurVar = new ajur(null);
                ajurVar.B(arrayList);
                ajurVar.b = null;
                ?? r3 = ajurVar.a;
                if (r3 != 0) {
                    ajurVar.B(alog.n(r3));
                    ?? r2 = ajurVar.b;
                    if (r2 != 0) {
                        ajurVar.b = alog.n(r2);
                    }
                    ?? r22 = ajurVar.a;
                    if (r22 != 0) {
                        acitVar2.b(new aibz(r22, ajurVar.b));
                        return (acir) acitVar2.a;
                    }
                    throw new IllegalStateException("Missing required properties: places");
                }
                throw new IllegalStateException("Property \"places\" has not been set");
            }
            return actx.s(((Map) obj).get(this.a));
        }
        aoxb aoxbVar = (aoxb) obj;
        acit acitVar3 = new acit();
        apax apaxVar3 = aoxbVar.b;
        apax apaxVar4 = aoxbVar.c;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator<E> it3 = apaxVar3.iterator();
        while (it3.hasNext()) {
            Object obj3 = this.a;
            arrayList3.add(((adef) ((atsg) obj3).b).g((aowr) it3.next()));
        }
        Iterator<E> it4 = apaxVar4.iterator();
        while (it4.hasNext()) {
            arrayList4.add(ahnz.b((aowx) it4.next()));
        }
        ajur ajurVar2 = new ajur(null);
        ajurVar2.A(arrayList3);
        ajurVar2.b = null;
        ?? r32 = ajurVar2.a;
        if (r32 != 0) {
            ajurVar2.A(alog.n(r32));
            ?? r23 = ajurVar2.b;
            if (r23 != 0) {
                ajurVar2.b = alog.n(r23);
            }
            ?? r24 = ajurVar2.a;
            if (r24 != 0) {
                acitVar3.b(new aicc(r24, ajurVar2.b));
                return (acir) acitVar3.a;
            }
            throw new IllegalStateException("Missing required properties: places");
        }
        throw new IllegalStateException("Property \"places\" has not been set");
    }
}
