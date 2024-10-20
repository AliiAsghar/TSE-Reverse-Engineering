package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adkn {
    public static final alpt a = alpt.r(wgf.OTP_TIMEOUT, wgf.OTP_THROTTLED);
    public final adnk b;
    public final aegu c;

    public adkn(adnk adnkVar, aegu aeguVar) {
        this.b = adnkVar;
        this.c = aeguVar;
    }

    public final boolean a(String str, String str2, int i) {
        Optional h = this.b.h(str, apjo.SIM);
        if (!h.isPresent() || !((wgi) h.get()).c.equals(str2) || Collection.EL.stream(((wgi) h.get()).d).filter(new addf(13)).count() < i) {
            return false;
        }
        return true;
    }

    public final void b(String str, apjo apjoVar, String str2, wgf wgfVar) {
        Optional empty;
        int aT;
        Optional empty2;
        Optional h = this.b.h(str, apjoVar);
        if (h.isEmpty()) {
            return;
        }
        Object obj = h.get();
        Optional empty3 = Optional.empty();
        if (str2 == null) {
            empty2 = Optional.empty();
        } else {
            wgi wgiVar = (wgi) obj;
            ArrayList an = alzz.an(wgiVar.d);
            if (wgiVar.d.isEmpty()) {
                empty = Optional.empty();
            } else {
                wgh wghVar = (wgh) alzz.aO(wgiVar.d);
                wge wgeVar = wghVar.c;
                if (wgeVar == null) {
                    wgeVar = wge.a;
                }
                if (wgeVar.d.equals(str2) && (aT = a.aT(wghVar.e)) != 0 && aT == 3) {
                    empty = Optional.of(wghVar);
                } else {
                    empty = Optional.empty();
                }
            }
            if (!empty.isEmpty()) {
                wge wgeVar2 = ((wgh) empty.get()).c;
                if (wgeVar2 == null) {
                    wgeVar2 = wge.a;
                }
                if (wgeVar2.d.equals(str2)) {
                    aozy createBuilder = wgg.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    wgg wggVar = (wgg) createBuilder.b;
                    wggVar.e = wgfVar.a();
                    wggVar.b |= 4;
                    apct b = apds.b(this.c.f().toEpochMilli());
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    wgg wggVar2 = (wgg) createBuilder.b;
                    b.getClass();
                    wggVar2.c = b;
                    wggVar2.b |= 1;
                    empty3.isPresent();
                    aozy createBuilder2 = wgh.a.createBuilder((apag) empty.get());
                    wgg wggVar3 = (wgg) createBuilder.s();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    wgh wghVar2 = (wgh) createBuilder2.b;
                    wggVar3.getClass();
                    wghVar2.d = wggVar3;
                    wghVar2.b |= 2;
                    an.set(an.size() - 1, (wgh) createBuilder2.s());
                    aozy createBuilder3 = wgi.a.createBuilder((apag) obj);
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    ((wgi) createBuilder3.b).d = wgi.emptyProtobufList();
                    createBuilder3.Z(an);
                    empty2 = Optional.of((wgi) createBuilder3.s());
                }
            }
            empty2 = Optional.empty();
        }
        empty2.ifPresent(new aakk(this, str, apjoVar, 6));
    }
}
