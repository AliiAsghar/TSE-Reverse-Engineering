package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class irl {
    public final anen a;
    public final aneo b;
    public final nct c;
    public final trz d;
    public final armf e;
    public final da f;
    public MessageIdType g = rvc.a;
    public final eoy h;
    private final armf i;

    public irl(anen anenVar, aneo aneoVar, eoy eoyVar, nct nctVar, trz trzVar, armf armfVar, armf armfVar2, da daVar) {
        this.a = anenVar;
        this.b = aneoVar;
        this.h = eoyVar;
        this.c = nctVar;
        this.d = trzVar;
        this.i = armfVar;
        this.e = armfVar2;
        this.f = daVar;
    }

    public static final irm b(rry rryVar, String str, boolean z, boolean z2) {
        String str2;
        SelfIdentityId s = rryVar.s();
        if (s != null) {
            str2 = ((SelfIdentityIdImpl) s).a;
        } else {
            str2 = "";
        }
        aozy createBuilder = irm.a.createBuilder();
        int f = rryVar.f();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        irm irmVar = (irm) createBuilder.b;
        boolean z3 = true;
        irmVar.b |= 1;
        irmVar.c = f;
        String a = rryVar.u().a();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        irm irmVar2 = (irm) apagVar;
        a.getClass();
        irmVar2.b |= 2;
        irmVar2.d = a;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        irm irmVar3 = (irm) createBuilder.b;
        str.getClass();
        irmVar3.b |= 4;
        irmVar3.e = str;
        boolean aq = rryVar.aq();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        irm irmVar4 = (irm) createBuilder.b;
        irmVar4.b |= 8;
        irmVar4.f = aq;
        int b = rryVar.b();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        irm irmVar5 = (irm) createBuilder.b;
        irmVar5.b |= 2048;
        irmVar5.n = b;
        boolean as = rryVar.as();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        irm irmVar6 = (irm) apagVar2;
        irmVar6.b |= 16;
        irmVar6.g = as;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        irm irmVar7 = (irm) apagVar3;
        irmVar7.b |= 32;
        irmVar7.h = z;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        apag apagVar4 = createBuilder.b;
        irm irmVar8 = (irm) apagVar4;
        irmVar8.b |= 64;
        irmVar8.i = str2;
        if (!apagVar4.isMutable()) {
            createBuilder.u();
        }
        irm irmVar9 = (irm) createBuilder.b;
        irmVar9.b |= 128;
        irmVar9.j = z2;
        boolean aD = rryVar.aD();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        irm irmVar10 = (irm) createBuilder.b;
        irmVar10.b |= 256;
        irmVar10.k = aD;
        boolean aV = rryVar.aV();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        irm irmVar11 = (irm) createBuilder.b;
        irmVar11.b |= 512;
        irmVar11.l = aV;
        if (rryVar.f() != 21) {
            z3 = false;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        irm irmVar12 = (irm) createBuilder.b;
        irmVar12.b |= 1024;
        irmVar12.m = z3;
        return (irm) createBuilder.s();
    }

    public final String a(ParticipantsTable.BindData bindData) {
        if (bindData == null) {
            return "";
        }
        return ((iew) this.i.b()).n(bindData, false);
    }
}
