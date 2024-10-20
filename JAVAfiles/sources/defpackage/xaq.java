package defpackage;

import android.os.Bundle;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xaq {
    public static final /* synthetic */ int o = 0;
    private static final alog p = alog.C("aliasEnabled", "allowChangingMmsRoamingAutoRetrieve", "allowEditingSmscAddress", "allowEnablingWapPushSI", "enabledMMS", "enabledNotifyWapMMSC", "enabledTransID", "enableGroupMms", "enableMultipartSMS", "enableWapPushSI", "groupChatDefaultsToMMS", "mms_auto_retrieve_enabled_bool", "mmsRoamingAutoRetrieveByDefault", "sendMultipartSmsAsSeparateMessages", "smsEncodingChangeable", "smsUsesSimpleCharactersOnly", "supportHttpCharsetHeader", "supportMmsContentDisposition", "supportMmsPriority", "useCustomUserAgent");
    private static final alog q = alog.C("aliasMaxChars", "aliasMinChars", "emailGatewaySmsToMmsTextThreshold", "httpSocketTimeout", "maxImageHeight", "maxImageWidth", "maxMessageTextSize", "recipientLimit", "smsToMmsTextLengthThreshold", "smsToMmsTextThreshold", "maxMessageSize", "maxSubjectLength", new String[0]);
    private static final alog r = alog.v("emailGatewayNumber", "httpParams", "naiSuffix", "spamForwardingNumber", "uaProfTagName");
    public final xan a;
    public final yjy b;
    public final xbo c;
    public final xbt d;
    public final xbg e;
    public final xbo l;
    public final yyz m;
    public final znj n;
    private final Bundle s = d.ax();
    public final Bundle f = new Bundle();
    public final Bundle g = new Bundle();
    public Bundle h = new Bundle();
    public Bundle i = new Bundle();
    public Bundle j = new Bundle();
    public Bundle k = new Bundle();

    public xaq(xan xanVar, yyz yyzVar, yjy yjyVar, xbo xboVar, xbo xboVar2, xbt xbtVar, znj znjVar, xbg xbgVar) {
        this.a = xanVar;
        this.m = yyzVar;
        this.b = yjyVar;
        this.l = xboVar;
        this.c = xboVar2;
        this.d = xbtVar;
        this.n = znjVar;
        this.e = xbgVar;
    }

    private static Optional d(Bundle bundle, String str) {
        if (bundle != null && bundle.containsKey(str)) {
            String string = bundle.getString(str);
            if (string == null) {
                string = "null";
            }
            return Optional.of(string);
        }
        return Optional.empty();
    }

    public final amef a(String str) {
        if (p.contains(str)) {
            aozy createBuilder = amef.a.createBuilder();
            if (this.s.containsKey(str)) {
                boolean z = this.s.getBoolean(str);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                amef amefVar = (amef) apagVar;
                amefVar.b |= 4;
                amefVar.e = z;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar2 = createBuilder.b;
                amef amefVar2 = (amef) apagVar2;
                amefVar2.b |= 1;
                amefVar2.c = z;
                if (!apagVar2.isMutable()) {
                    createBuilder.u();
                }
                amef amefVar3 = (amef) createBuilder.b;
                amefVar3.d = 1;
                amefVar3.b |= 2;
            }
            if (this.f.containsKey(str)) {
                boolean z2 = this.f.getBoolean(str);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar3 = createBuilder.b;
                amef amefVar4 = (amef) apagVar3;
                amefVar4.b |= 8;
                amefVar4.f = z2;
                if (!apagVar3.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar4 = createBuilder.b;
                amef amefVar5 = (amef) apagVar4;
                amefVar5.b |= 1;
                amefVar5.c = z2;
                if (!apagVar4.isMutable()) {
                    createBuilder.u();
                }
                amef amefVar6 = (amef) createBuilder.b;
                amefVar6.d = 2;
                amefVar6.b |= 2;
            }
            if (this.g.containsKey(str)) {
                boolean z3 = this.g.getBoolean(str);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar5 = createBuilder.b;
                amef amefVar7 = (amef) apagVar5;
                amefVar7.b |= 16;
                amefVar7.g = z3;
                if (!apagVar5.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar6 = createBuilder.b;
                amef amefVar8 = (amef) apagVar6;
                amefVar8.b |= 1;
                amefVar8.c = z3;
                if (!apagVar6.isMutable()) {
                    createBuilder.u();
                }
                amef amefVar9 = (amef) createBuilder.b;
                amefVar9.d = 3;
                amefVar9.b |= 2;
            }
            Bundle bundle = this.h;
            if (bundle != null && bundle.containsKey(str)) {
                boolean z4 = this.h.getBoolean(str);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar7 = createBuilder.b;
                amef amefVar10 = (amef) apagVar7;
                amefVar10.b |= 32;
                amefVar10.h = z4;
                if (!apagVar7.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar8 = createBuilder.b;
                amef amefVar11 = (amef) apagVar8;
                amefVar11.b |= 1;
                amefVar11.c = z4;
                if (!apagVar8.isMutable()) {
                    createBuilder.u();
                }
                amef amefVar12 = (amef) createBuilder.b;
                amefVar12.d = 4;
                amefVar12.b |= 2;
            }
            if (this.j.containsKey(str)) {
                boolean z5 = this.j.getBoolean(str);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar9 = createBuilder.b;
                amef amefVar13 = (amef) apagVar9;
                amefVar13.b |= 128;
                amefVar13.j = z5;
                if (!apagVar9.isMutable()) {
                    createBuilder.u();
                }
                amef amefVar14 = (amef) createBuilder.b;
                amefVar14.b |= 1;
                amefVar14.c = z5;
                if (this.n.W()) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amef amefVar15 = (amef) createBuilder.b;
                    amefVar15.d = 8;
                    amefVar15.b |= 2;
                } else {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amef amefVar16 = (amef) createBuilder.b;
                    amefVar16.d = 6;
                    amefVar16.b |= 2;
                }
            }
            if (this.k.containsKey(str)) {
                boolean z6 = this.k.getBoolean(str);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar10 = createBuilder.b;
                amef amefVar17 = (amef) apagVar10;
                amefVar17.b |= 256;
                amefVar17.k = z6;
                if (!apagVar10.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar11 = createBuilder.b;
                amef amefVar18 = (amef) apagVar11;
                amefVar18.b |= 1;
                amefVar18.c = z6;
                if (!apagVar11.isMutable()) {
                    createBuilder.u();
                }
                amef amefVar19 = (amef) createBuilder.b;
                amefVar19.d = 7;
                amefVar19.b |= 2;
            }
            if (this.i.containsKey(str)) {
                boolean z7 = this.i.getBoolean(str);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar12 = createBuilder.b;
                amef amefVar20 = (amef) apagVar12;
                amefVar20.b |= 64;
                amefVar20.i = z7;
                if (!apagVar12.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar13 = createBuilder.b;
                amef amefVar21 = (amef) apagVar13;
                amefVar21.b = 1 | amefVar21.b;
                amefVar21.c = z7;
                if (!apagVar13.isMutable()) {
                    createBuilder.u();
                }
                amef amefVar22 = (amef) createBuilder.b;
                amefVar22.d = 5;
                amefVar22.b |= 2;
            }
            return (amef) createBuilder.s();
        }
        throw new IllegalArgumentException(a.bW(str, "Carrier config key: ", " does not refer to a boolean value"));
    }

    public final amle b(String str) {
        if (q.contains(str)) {
            aozy createBuilder = amle.a.createBuilder();
            if (this.s.containsKey(str)) {
                int i = this.s.getInt(str);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                amle amleVar = (amle) apagVar;
                amleVar.b |= 4;
                amleVar.e = i;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar2 = createBuilder.b;
                amle amleVar2 = (amle) apagVar2;
                amleVar2.b |= 1;
                amleVar2.c = i;
                if (!apagVar2.isMutable()) {
                    createBuilder.u();
                }
                amle amleVar3 = (amle) createBuilder.b;
                amleVar3.d = 1;
                amleVar3.b |= 2;
            }
            if (this.f.containsKey(str)) {
                int i2 = this.f.getInt(str);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar3 = createBuilder.b;
                amle amleVar4 = (amle) apagVar3;
                amleVar4.b |= 8;
                amleVar4.f = i2;
                if (!apagVar3.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar4 = createBuilder.b;
                amle amleVar5 = (amle) apagVar4;
                amleVar5.b |= 1;
                amleVar5.c = i2;
                if (!apagVar4.isMutable()) {
                    createBuilder.u();
                }
                amle amleVar6 = (amle) createBuilder.b;
                amleVar6.d = 2;
                amleVar6.b |= 2;
            }
            if (this.g.containsKey(str)) {
                int i3 = this.g.getInt(str);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar5 = createBuilder.b;
                amle amleVar7 = (amle) apagVar5;
                amleVar7.b |= 16;
                amleVar7.g = i3;
                if (!apagVar5.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar6 = createBuilder.b;
                amle amleVar8 = (amle) apagVar6;
                amleVar8.b |= 1;
                amleVar8.c = i3;
                if (!apagVar6.isMutable()) {
                    createBuilder.u();
                }
                amle amleVar9 = (amle) createBuilder.b;
                amleVar9.d = 3;
                amleVar9.b |= 2;
            }
            Bundle bundle = this.h;
            if (bundle != null && bundle.containsKey(str)) {
                int i4 = this.h.getInt(str);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar7 = createBuilder.b;
                amle amleVar10 = (amle) apagVar7;
                amleVar10.b |= 32;
                amleVar10.h = i4;
                if (!apagVar7.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar8 = createBuilder.b;
                amle amleVar11 = (amle) apagVar8;
                amleVar11.b |= 1;
                amleVar11.c = i4;
                if (!apagVar8.isMutable()) {
                    createBuilder.u();
                }
                amle amleVar12 = (amle) createBuilder.b;
                amleVar12.d = 4;
                amleVar12.b |= 2;
            }
            if (this.j.containsKey(str)) {
                int i5 = this.j.getInt(str);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar9 = createBuilder.b;
                amle amleVar13 = (amle) apagVar9;
                amleVar13.b |= 128;
                amleVar13.j = i5;
                if (!apagVar9.isMutable()) {
                    createBuilder.u();
                }
                amle amleVar14 = (amle) createBuilder.b;
                amleVar14.b |= 1;
                amleVar14.c = i5;
                if (this.n.W()) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amle amleVar15 = (amle) createBuilder.b;
                    amleVar15.d = 8;
                    amleVar15.b |= 2;
                } else {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amle amleVar16 = (amle) createBuilder.b;
                    amleVar16.d = 6;
                    amleVar16.b |= 2;
                }
            }
            if (this.k.containsKey(str)) {
                int i6 = this.k.getInt(str);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar10 = createBuilder.b;
                amle amleVar17 = (amle) apagVar10;
                amleVar17.b |= 256;
                amleVar17.k = i6;
                if (!apagVar10.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar11 = createBuilder.b;
                amle amleVar18 = (amle) apagVar11;
                amleVar18.b |= 1;
                amleVar18.c = i6;
                if (!apagVar11.isMutable()) {
                    createBuilder.u();
                }
                amle amleVar19 = (amle) createBuilder.b;
                amleVar19.d = 7;
                amleVar19.b |= 2;
            }
            if (this.i.containsKey(str)) {
                int i7 = this.i.getInt(str);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar12 = createBuilder.b;
                amle amleVar20 = (amle) apagVar12;
                amleVar20.b |= 64;
                amleVar20.i = i7;
                if (!apagVar12.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar13 = createBuilder.b;
                amle amleVar21 = (amle) apagVar13;
                amleVar21.b = 1 | amleVar21.b;
                amleVar21.c = i7;
                if (!apagVar13.isMutable()) {
                    createBuilder.u();
                }
                amle amleVar22 = (amle) createBuilder.b;
                amleVar22.d = 5;
                amleVar22.b |= 2;
            }
            return (amle) createBuilder.s();
        }
        throw new IllegalArgumentException(a.bW(str, "Carrier config key: ", " does not refer to an int value"));
    }

    public final ammw c(String str) {
        if (r.contains(str)) {
            aozy createBuilder = ammw.a.createBuilder();
            Optional d = d(this.s, str);
            if (d.isPresent()) {
                Object obj = d.get();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ammw ammwVar = (ammw) createBuilder.b;
                ammwVar.b |= 4;
                ammwVar.e = (String) obj;
                Object obj2 = d.get();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                ammw ammwVar2 = (ammw) apagVar;
                ammwVar2.b |= 1;
                ammwVar2.c = (String) obj2;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                ammw ammwVar3 = (ammw) createBuilder.b;
                ammwVar3.d = 1;
                ammwVar3.b |= 2;
            }
            Optional d2 = d(this.f, str);
            if (d2.isPresent()) {
                Object obj3 = d2.get();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ammw ammwVar4 = (ammw) createBuilder.b;
                ammwVar4.b |= 8;
                ammwVar4.f = (String) obj3;
                Object obj4 = d2.get();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar2 = createBuilder.b;
                ammw ammwVar5 = (ammw) apagVar2;
                ammwVar5.b |= 1;
                ammwVar5.c = (String) obj4;
                if (!apagVar2.isMutable()) {
                    createBuilder.u();
                }
                ammw ammwVar6 = (ammw) createBuilder.b;
                ammwVar6.d = 2;
                ammwVar6.b |= 2;
            }
            Optional d3 = d(this.g, str);
            if (d3.isPresent()) {
                Object obj5 = d3.get();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ammw ammwVar7 = (ammw) createBuilder.b;
                ammwVar7.b |= 16;
                ammwVar7.g = (String) obj5;
                Object obj6 = d3.get();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar3 = createBuilder.b;
                ammw ammwVar8 = (ammw) apagVar3;
                ammwVar8.b |= 1;
                ammwVar8.c = (String) obj6;
                if (!apagVar3.isMutable()) {
                    createBuilder.u();
                }
                ammw ammwVar9 = (ammw) createBuilder.b;
                ammwVar9.d = 3;
                ammwVar9.b |= 2;
            }
            Optional d4 = d(this.h, str);
            if (d4.isPresent()) {
                Object obj7 = d4.get();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ammw ammwVar10 = (ammw) createBuilder.b;
                ammwVar10.b |= 32;
                ammwVar10.h = (String) obj7;
                Object obj8 = d4.get();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar4 = createBuilder.b;
                ammw ammwVar11 = (ammw) apagVar4;
                ammwVar11.b |= 1;
                ammwVar11.c = (String) obj8;
                if (!apagVar4.isMutable()) {
                    createBuilder.u();
                }
                ammw ammwVar12 = (ammw) createBuilder.b;
                ammwVar12.d = 4;
                ammwVar12.b |= 2;
            }
            Optional d5 = d(this.j, str);
            if (d5.isPresent()) {
                Object obj9 = d5.get();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ammw ammwVar13 = (ammw) createBuilder.b;
                ammwVar13.b |= 128;
                ammwVar13.j = (String) obj9;
                Object obj10 = d5.get();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ammw ammwVar14 = (ammw) createBuilder.b;
                ammwVar14.b |= 1;
                ammwVar14.c = (String) obj10;
                if (this.n.W()) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ammw ammwVar15 = (ammw) createBuilder.b;
                    ammwVar15.d = 8;
                    ammwVar15.b |= 2;
                } else {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ammw ammwVar16 = (ammw) createBuilder.b;
                    ammwVar16.d = 6;
                    ammwVar16.b |= 2;
                }
            }
            Optional d6 = d(this.k, str);
            if (d6.isPresent()) {
                Object obj11 = d6.get();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ammw ammwVar17 = (ammw) createBuilder.b;
                ammwVar17.b |= 256;
                ammwVar17.k = (String) obj11;
                Object obj12 = d6.get();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar5 = createBuilder.b;
                ammw ammwVar18 = (ammw) apagVar5;
                ammwVar18.b |= 1;
                ammwVar18.c = (String) obj12;
                if (!apagVar5.isMutable()) {
                    createBuilder.u();
                }
                ammw ammwVar19 = (ammw) createBuilder.b;
                ammwVar19.d = 7;
                ammwVar19.b |= 2;
            }
            Optional d7 = d(this.i, str);
            if (d7.isPresent()) {
                Object obj13 = d7.get();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ammw ammwVar20 = (ammw) createBuilder.b;
                ammwVar20.b |= 64;
                ammwVar20.i = (String) obj13;
                Object obj14 = d7.get();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar6 = createBuilder.b;
                ammw ammwVar21 = (ammw) apagVar6;
                ammwVar21.b |= 1;
                ammwVar21.c = (String) obj14;
                if (!apagVar6.isMutable()) {
                    createBuilder.u();
                }
                ammw ammwVar22 = (ammw) createBuilder.b;
                ammwVar22.d = 5;
                ammwVar22.b |= 2;
            }
            return (ammw) createBuilder.s();
        }
        throw new IllegalArgumentException(a.bW(str, "Carrier config key: ", " does not refer to a String value"));
    }
}
