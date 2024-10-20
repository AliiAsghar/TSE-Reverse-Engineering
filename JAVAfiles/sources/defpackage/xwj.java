package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xwj {
    public static final xze a = xze.g("BugleAnnotation", "MessageAnnotationUtils");
    public static final uue b = uuh.s(uuh.b, "otp_message_annotations_grammar", new alhr() { // from class: xwi
        @Override // defpackage.alhr
        public final Object get() {
            xze xzeVar = xwj.a;
            aozy createBuilder = alco.a.createBuilder();
            aozy createBuilder2 = alcp.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar = createBuilder2.b;
            ((alcp) apagVar).b = "(?i)((otp|sms|secret|safepass|unique\\s+id|secure|security|authorization|authentication|access|login|verification|confirmation|check|password\\s+reset|one-time|identification|activation|registration|validation)\\s+){1,3}code(\\s+(for(\\s+[^\\s]+){1,3}|you\\s+requested))?(\\s+is:?|:)?\\s+(?-i)([a-z]-|[\"'\\(])?([A-Z0-9]{4,})[\"'\\)]?(\\s|\\.|,)";
            if (!apagVar.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar2 = createBuilder2.b;
            ((alcp) apagVar2).c = 8;
            if (!apagVar2.isMutable()) {
                createBuilder2.u();
            }
            ((alcp) createBuilder2.b).d = "[0-9A-Z]*[0-9][0-9A-Z]*";
            createBuilder.bn(createBuilder2);
            aozy createBuilder3 = alcp.a.createBuilder();
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            apag apagVar3 = createBuilder3.b;
            ((alcp) apagVar3).b = "(?-i)([a-z]-|[\"'\\(])?([A-Z0-9]{4,})[\"'\\)]?(?i)(\\s+is\\s+your)?(\\s+facebook|\\s+messenger){0,2}(\\s+[^\\s]+){0,2}(\\s+(otp|sms|secret|safepass|unique\\s+id|secure|security|authorization|authentication|access|login|verification|confirmation|check|password\\s+reset|one-time|identification|activation|registration|validation)){1,3}\\s+code";
            if (!apagVar3.isMutable()) {
                createBuilder3.u();
            }
            apag apagVar4 = createBuilder3.b;
            ((alcp) apagVar4).c = 2;
            if (!apagVar4.isMutable()) {
                createBuilder3.u();
            }
            ((alcp) createBuilder3.b).d = "[0-9A-Z]*[0-9][0-9A-Z]*";
            createBuilder.bn(createBuilder3);
            aozy createBuilder4 = alcp.a.createBuilder();
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            apag apagVar5 = createBuilder4.b;
            ((alcp) apagVar5).b = "^(?i)([^\\s]+\\s+)?your\\s+([^\\s]+\\s+){0,2}code(\\s+is:?|:)\\s+(?-i)([a-z]-|[\"'\\(])?([A-Z0-9]{4,})[\"'\\)]?(\\s|\\.)";
            if (!apagVar5.isMutable()) {
                createBuilder4.u();
            }
            apag apagVar6 = createBuilder4.b;
            ((alcp) apagVar6).c = 5;
            if (!apagVar6.isMutable()) {
                createBuilder4.u();
            }
            ((alcp) createBuilder4.b).d = "[0-9A-Z]*[0-9][0-9A-Z]*";
            createBuilder.bn(createBuilder4);
            aozy createBuilder5 = alcp.a.createBuilder();
            if (!createBuilder5.b.isMutable()) {
                createBuilder5.u();
            }
            apag apagVar7 = createBuilder5.b;
            ((alcp) apagVar7).b = "^(?-i)([a-z]-|[\"'\\(])?([A-Z0-9]{4,})[\"'\\)]?(?i)\\s+is\\s+your\\s+([^\\s]+\\s+)?code(\\.|\\s+for|\\s+to)";
            if (!apagVar7.isMutable()) {
                createBuilder5.u();
            }
            apag apagVar8 = createBuilder5.b;
            ((alcp) apagVar8).c = 2;
            if (!apagVar8.isMutable()) {
                createBuilder5.u();
            }
            ((alcp) createBuilder5.b).d = "[0-9A-Z]*[0-9][0-9A-Z]*";
            createBuilder.bn(createBuilder5);
            aozy createBuilder6 = alcp.a.createBuilder();
            if (!createBuilder6.b.isMutable()) {
                createBuilder6.u();
            }
            apag apagVar9 = createBuilder6.b;
            ((alcp) apagVar9).b = "(?i)(enter|use)\\s+(the\\s+|this\\s+)?([^\\s]+\\s+)?code:?\\s+(?-i)([a-z]-|[\"'\\(])?([A-Z0-9]{4,})[\"'\\)]?(?i)\\s+to\\s+(confirm|verify)";
            if (!apagVar9.isMutable()) {
                createBuilder6.u();
            }
            apag apagVar10 = createBuilder6.b;
            ((alcp) apagVar10).c = 5;
            if (!apagVar10.isMutable()) {
                createBuilder6.u();
            }
            ((alcp) createBuilder6.b).d = "[0-9A-Z]*[0-9][0-9A-Z]*";
            createBuilder.bn(createBuilder6);
            aozy createBuilder7 = alcp.a.createBuilder();
            if (!createBuilder7.b.isMutable()) {
                createBuilder7.u();
            }
            apag apagVar11 = createBuilder7.b;
            ((alcp) apagVar11).b = "^(?i)([^\\s]+\\s+)?code(\\s+is:?|:)?\\s+(?-i)([a-z]-|[\"'\\(])?([A-Z0-9]{4,})[\"'\\)]?(\\.|\\s)$";
            if (!apagVar11.isMutable()) {
                createBuilder7.u();
            }
            apag apagVar12 = createBuilder7.b;
            ((alcp) apagVar12).c = 4;
            if (!apagVar12.isMutable()) {
                createBuilder7.u();
            }
            ((alcp) createBuilder7.b).d = "[0-9A-Z]*[0-9][0-9A-Z]*";
            createBuilder.bn(createBuilder7);
            aozy createBuilder8 = alcp.a.createBuilder();
            if (!createBuilder8.b.isMutable()) {
                createBuilder8.u();
            }
            apag apagVar13 = createBuilder8.b;
            ((alcp) apagVar13).b = "^(?i)use\\s+(?-i)([A-Z0-9]{4,})(?i)\\s+as(\\s+your)?(\\s+microsoft\\s+account|\\s+instagram)(\\s+[^\\s]+){0,2}\\s+code";
            if (!apagVar13.isMutable()) {
                createBuilder8.u();
            }
            apag apagVar14 = createBuilder8.b;
            ((alcp) apagVar14).c = 1;
            if (!apagVar14.isMutable()) {
                createBuilder8.u();
            }
            ((alcp) createBuilder8.b).d = "[0-9A-Z]*[0-9][0-9A-Z]*";
            createBuilder.bn(createBuilder8);
            aozy createBuilder9 = alcp.a.createBuilder();
            if (!createBuilder9.b.isMutable()) {
                createBuilder9.u();
            }
            apag apagVar15 = createBuilder9.b;
            ((alcp) apagVar15).b = "^(?i)snapchat\\s+code:\\s+(?-i)([A-Z0-9]{4,})\\.";
            if (!apagVar15.isMutable()) {
                createBuilder9.u();
            }
            apag apagVar16 = createBuilder9.b;
            ((alcp) apagVar16).c = 1;
            if (!apagVar16.isMutable()) {
                createBuilder9.u();
            }
            ((alcp) createBuilder9.b).d = "[0-9A-Z]*[0-9][0-9A-Z]*";
            createBuilder.bn(createBuilder9);
            aozy createBuilder10 = alcp.a.createBuilder();
            if (!createBuilder10.b.isMutable()) {
                createBuilder10.u();
            }
            apag apagVar17 = createBuilder10.b;
            ((alcp) apagVar17).b = "^(?i)enter\\s+this\\s+code\\s+to\\s+reset\\s+your\\s+twitter\\s+password:\\s+(?-i)([A-Z0-9]{4,})\\.?";
            if (!apagVar17.isMutable()) {
                createBuilder10.u();
            }
            apag apagVar18 = createBuilder10.b;
            ((alcp) apagVar18).c = 1;
            if (!apagVar18.isMutable()) {
                createBuilder10.u();
            }
            ((alcp) createBuilder10.b).d = "[0-9A-Z]*[0-9][0-9A-Z]*";
            createBuilder.bn(createBuilder10);
            return ((alco) createBuilder.s()).toByteArray();
        }
    });
    public final apwt c;
    public final armf d;
    public final armf e;
    public final anen f;
    public final anen g;
    public final armf h;
    public final yyb i;
    public final yyb j = new yyb();
    private final Context k;
    private final armf l;
    private final armf m;
    private final armf n;

    public xwj(Context context, armf armfVar, armf armfVar2, armf armfVar3, apwt apwtVar, armf armfVar4, yyb yybVar, anen anenVar, anen anenVar2, armf armfVar5, armf armfVar6) {
        this.k = context;
        this.d = armfVar;
        this.e = armfVar2;
        this.l = armfVar3;
        this.c = apwtVar;
        this.m = armfVar4;
        int i = xwf.a;
        this.i = yybVar;
        this.f = anenVar;
        this.g = anenVar2;
        this.h = armfVar5;
        this.n = armfVar6;
    }

    public static boolean d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aqby aqbyVar = (aqby) it.next();
            int g = aqas.g(aqbyVar.d);
            if (g != 0 && g == 8 && aqbyVar.b == 7) {
                return true;
            }
        }
        return false;
    }

    public static boolean f() {
        return ((Boolean) yic.h.e()).booleanValue();
    }

    public static boolean g() {
        return ((Boolean) yic.c.e()).booleanValue();
    }

    public static boolean h() {
        if (!((Boolean) yic.b.e()).booleanValue() && !g() && !((Boolean) yic.d.e()).booleanValue() && !((Boolean) yic.e.e()).booleanValue() && !((Boolean) yic.f.e()).booleanValue() && !((Boolean) yic.g.e()).booleanValue()) {
            return false;
        }
        return true;
    }

    public final akul a(String str, MessageIdType messageIdType, aqax aqaxVar) {
        if (TextUtils.isEmpty(str)) {
            return aktp.af(new IllegalArgumentException("otpCode id is null"));
        }
        yti ytiVar = (yti) this.m.b();
        if (ytiVar != null) {
            ytiVar.a(str, this.k.getString(R.string.otp_copied_to_clipboard));
        }
        if (messageIdType.b()) {
            xyo e = a.e();
            e.H("No message id passed");
            e.L("OTP code", str);
            e.q();
            return aktp.af(new IllegalArgumentException("Message id is null"));
        }
        return aktp.ai(new xqt(this, messageIdType, aqaxVar, 6), this.f);
    }

    public final void b(SuggestionData suggestionData, aqax aqaxVar) {
        aqce aqceVar;
        if (suggestionData instanceof SmartSuggestionItemSuggestionData) {
            aqcz aqczVar = ((SmartSuggestionItemSuggestionData) suggestionData).c;
            if (aqczVar.c == 18) {
                aqceVar = (aqce) aqczVar.d;
            } else {
                aqceVar = aqce.a;
            }
            String str = aqceVar.b;
            aqcy aqcyVar = aqczVar.e;
            if (aqcyVar == null) {
                aqcyVar = aqcy.b;
            }
            MessageIdType b2 = rvc.b(aqcyVar.l);
            aqcy aqcyVar2 = aqczVar.e;
            if (aqcyVar2 == null) {
                aqcyVar2 = aqcy.b;
            }
            ConversationIdType b3 = ruy.b(aqcyVar2.m);
            aktp.aa(a(str, b2, aqaxVar), qjc.a(new pum(7)), this.f);
            if (!b3.b()) {
                ((rix) this.n.b()).e(b3);
            }
        }
    }

    public final void c(MessageCoreData messageCoreData) {
        aqby b2;
        if (e() && (b2 = ((xwl) this.c.b()).b(messageCoreData, true)) != null) {
            ((yhq) this.d.b()).b(messageCoreData.z(), messageCoreData.B(), alog.r(b2));
        }
    }

    public final boolean e() {
        return ((xwl) this.c.b()).c((byte[]) b.e());
    }

    public final amem i(MessageCoreData messageCoreData, String str, int i) {
        int i2;
        ParticipantsTable.BindData a2 = ((rxq) this.l.b()).a(messageCoreData.aw());
        aozy createBuilder = amem.a.createBuilder();
        if (a2 != null) {
            i2 = rxn.u(a2);
        } else {
            i2 = 1;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amem amemVar = (amem) createBuilder.b;
        amemVar.d = i2 - 1;
        amemVar.b |= 2;
        boolean z = false;
        if (a2 != null && TextUtils.isEmpty(a2.N())) {
            z = true;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amem amemVar2 = (amem) apagVar;
        amemVar2.b |= 4;
        amemVar2.e = z;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amem amemVar3 = (amem) apagVar2;
        amemVar3.c = aqas.f(i);
        amemVar3.b |= 1;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        amem amemVar4 = (amem) createBuilder.b;
        amemVar4.b |= 64;
        amemVar4.h = str;
        return (amem) createBuilder.s();
    }
}
