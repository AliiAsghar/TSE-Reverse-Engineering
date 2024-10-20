package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zhg {
    public final Object a;

    public zhg(zhf zhfVar, armf armfVar) {
        this.a = ((zmk) armfVar.b()).a(zhfVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ SmartSuggestionData a(String str) {
        aozy createBuilder = aqcz.a.createBuilder();
        aozy createBuilder2 = aqda.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        aqda aqdaVar = (aqda) createBuilder2.b;
        str.getClass();
        aqdaVar.c = str;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aqcz aqczVar = (aqcz) createBuilder.b;
        aqda aqdaVar2 = (aqda) createBuilder2.s();
        aqdaVar2.getClass();
        aqczVar.d = aqdaVar2;
        aqczVar.c = 2;
        aozy createBuilder3 = aqcy.b.createBuilder();
        aqbc aqbcVar = aqbc.FULL_MESSAGE;
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        ((aqcy) createBuilder3.b).k = aqbcVar.a();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aqcz aqczVar2 = (aqcz) createBuilder.b;
        aqcy aqcyVar = (aqcy) createBuilder3.s();
        aqcyVar.getClass();
        aqczVar2.e = aqcyVar;
        aqczVar2.b |= 1;
        return new SmartSuggestionItemSuggestionData((aqcz) createBuilder.s());
    }

    public zhg(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public zhg(armf armfVar, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public zhg(armf armfVar, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
    }
}
