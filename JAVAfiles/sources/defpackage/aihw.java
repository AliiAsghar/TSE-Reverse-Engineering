package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aihw {
    public final List d;
    public final List e;
    public aiia f;
    public aiib g;
    public boolean h;
    public Optional i;
    public Optional j;
    public Optional k;
    public Optional l;
    public static final advp a = new advp("DnsClient.Builder");
    private static final Optional m = Optional.empty();
    private static final Optional n = Optional.empty();
    public static final anen b = albo.bB(Executors.newFixedThreadPool(2, new acra(7)));
    public static final ExecutorService c = Executors.newSingleThreadExecutor();

    public aihw() {
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new aiia() { // from class: aihu
            @Override // defpackage.aiia
            public final void a(aihy aihyVar) {
                advp advpVar = aihw.a;
            }
        };
        this.g = new aiib() { // from class: aihv
            @Override // defpackage.aiib
            public final void a(aihz aihzVar) {
                advp advpVar = aihw.a;
            }
        };
        this.h = false;
        this.i = Optional.empty();
        this.j = Optional.empty();
        this.k = Optional.empty();
        this.l = Optional.empty();
    }

    public static int a() {
        return ((Integer) m.orElse(53)).intValue();
    }

    public static aiic b() {
        return (aiic) n.orElse(aiic.UDP);
    }

    public final String toString() {
        List list = this.e;
        return "Builder[DnsTransportAddresses:" + this.d.toString() + ", Async:" + this.h + ", FallbackDnsTransportAddresses:" + list.toString() + ", LocalAddress:" + String.valueOf(this.i) + ", resolverTimeout:" + String.valueOf(this.j) + ", resolverRetries:" + String.valueOf(this.k) + "]";
    }

    public aihw(aihw aihwVar) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.e = arrayList2;
        this.f = new aiia() { // from class: aihu
            @Override // defpackage.aiia
            public final void a(aihy aihyVar) {
                advp advpVar = aihw.a;
            }
        };
        this.g = new aiib() { // from class: aihv
            @Override // defpackage.aiib
            public final void a(aihz aihzVar) {
                advp advpVar = aihw.a;
            }
        };
        this.h = false;
        this.i = Optional.empty();
        this.j = Optional.empty();
        this.k = Optional.empty();
        this.l = Optional.empty();
        arrayList.addAll(aihwVar.d);
        arrayList2.addAll(aihwVar.e);
        this.f = aihwVar.f;
        this.g = aihwVar.g;
        this.h = aihwVar.h;
        this.i = aihwVar.i.map(new aiec(7));
        this.j = aihwVar.j.map(new aiec(8));
        this.k = aihwVar.k.map(new aiec(9));
        this.l = aihwVar.l.map(new aiec(10));
    }
}
