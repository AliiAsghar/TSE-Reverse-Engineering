package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import j$.util.Optional;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class khh implements khg {
    public final armf a;
    private final Optional b;

    static {
        aqjn.m(new armo(8, kip.a), new armo(9, kip.b), new armo(10, kip.c));
        aqjn.m(new armo(kip.a, amti.TEXT), new armo(kip.b, amti.AUDIO), new armo(kip.c, amti.VIDEO));
        aqjn.m(new armo(11, amtj.WEBVIEW), new armo(1, amtj.BROWSER));
    }

    public khh(arwe arweVar, arwe arweVar2, Context context, Conversation conversation, lfx lfxVar, mja mjaVar, asai asaiVar, @nwv armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, Optional optional, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, armf armfVar16, armf armfVar17, armf armfVar18, armf armfVar19, armf armfVar20, armf armfVar21, armf armfVar22, lre lreVar, armf armfVar23, armf armfVar24, armf armfVar25) {
        arweVar.getClass();
        arweVar2.getClass();
        context.getClass();
        conversation.getClass();
        lfxVar.getClass();
        mjaVar.getClass();
        asaiVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        armfVar8.getClass();
        armfVar9.getClass();
        armfVar10.getClass();
        armfVar11.getClass();
        armfVar12.getClass();
        armfVar13.getClass();
        armfVar14.getClass();
        armfVar15.getClass();
        armfVar16.getClass();
        armfVar17.getClass();
        armfVar18.getClass();
        armfVar19.getClass();
        armfVar20.getClass();
        armfVar21.getClass();
        armfVar22.getClass();
        lreVar.getClass();
        armfVar23.getClass();
        armfVar24.getClass();
        armfVar25.getClass();
        this.a = armfVar;
        this.b = optional;
        armd.a(new kfq(armfVar17, this, 2, null));
        armd.a(new kdz(armfVar18, 13));
    }

    @Override // defpackage.khg
    public final void a(mqz mqzVar) {
        aeyt a;
        mqzVar.getClass();
        if (!this.b.isEmpty() && (a = ((khi) ((armf) this.b.get()).b()).a()) != null) {
            if (mqzVar instanceof SmartSuggestionData) {
                if (!(a instanceof aeyu)) {
                    if (!(a instanceof aeyv)) {
                        if (a instanceof aeyp) {
                            throw null;
                        }
                        throw new armm();
                    }
                    throw null;
                }
                throw null;
            }
            if (mqzVar instanceof RbmSuggestionData) {
                if (!(a instanceof aeyu)) {
                    if (a instanceof aeyv) {
                        throw null;
                    }
                    Objects.toString(a);
                    throw new IllegalArgumentException("Unsupported RBM suggestion UI data type: ".concat(a.toString()));
                }
                throw null;
            }
        }
    }
}
