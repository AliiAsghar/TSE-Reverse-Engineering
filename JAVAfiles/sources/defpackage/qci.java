package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qci implements qbv {
    public static final alwo a = alwo.o("BugleGroupManagement");
    public final anen b;
    public final armf c;
    public final armf d;
    public final xnv e;
    public final apwt f;
    public final armf g;
    public final hmk h;
    private final armf i;
    private final uhg j;
    private final qcb k;

    public qci(anen anenVar, armf armfVar, armf armfVar2, uhg uhgVar, armf armfVar3, xnv xnvVar, qcb qcbVar, hmk hmkVar, apwt apwtVar, armf armfVar4) {
        this.b = anenVar;
        this.i = armfVar;
        this.c = armfVar2;
        this.j = uhgVar;
        this.d = armfVar3;
        this.e = xnvVar;
        this.k = qcbVar;
        this.h = hmkVar;
        this.f = apwtVar;
        this.g = armfVar4;
    }

    public static alze d(ParticipantsTable.BindData bindData, ParticipantsTable.BindData bindData2, String str) {
        alzc v = alzz.v();
        v.c(new alzk("groupOperation", str));
        v.b(qas.d, bindData.O());
        v.b(qas.e, bindData2.O());
        return v.a();
    }

    private final tap e(String str) {
        armf armfVar = this.i;
        tap g = rxn.g(str);
        ((rxq) armfVar.b()).h(g);
        return g;
    }

    private final void f(Set set, tap tapVar) {
        String str = tapVar.g;
        if (!albo.ah(str) && !set.contains(str)) {
            this.j.g(tapVar, 4);
            set.add(str);
        }
    }

    @Override // defpackage.qbv
    public final akul a(final ConversationIdType conversationIdType, qfl qflVar) {
        qfg qfgVar = qflVar.e;
        if (qfgVar == null) {
            qfgVar = qfg.a;
        }
        final qfg qfgVar2 = qfgVar;
        akul f = this.k.f(conversationIdType);
        return f.h(new algk() { // from class: qce
            /* JADX WARN: Code restructure failed: missing block: B:100:0x01b5, code lost:
            
                r10 = defpackage.qei.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:101:0x01b7, code lost:
            
                r10 = r4.b(r8, r10);
                r7 = r7.c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:102:0x01bd, code lost:
            
                if (r7 != null) goto L82;
             */
            /* JADX WARN: Code restructure failed: missing block: B:103:0x01bf, code lost:
            
                r7 = defpackage.qei.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:104:0x01c1, code lost:
            
                r7 = r4.c(r8, r7, r9, r2);
                r24 = defpackage.qci.d(r10, r7, "remove");
             */
            /* JADX WARN: Code restructure failed: missing block: B:108:0x01dc, code lost:
            
                if (((defpackage.rtz) r4.c.b()).ag(r10, r2.a, false) != false) goto L91;
             */
            /* JADX WARN: Code restructure failed: missing block: B:110:0x01f0, code lost:
            
                if (((defpackage.rtz) r4.c.b()).ae(r2.a, r10.M()) == false) goto L89;
             */
            /* JADX WARN: Code restructure failed: missing block: B:111:0x01f2, code lost:
            
                ((defpackage.alwl) ((defpackage.alwl) defpackage.qci.a.i()).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/ParticipantsGroupMetadataProcessor", "removeParticipantFromGroup", 396, "ParticipantsGroupMetadataProcessor.java")).q("Participant not successfully removed from the conversation.");
                r7 = defpackage.qch.c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:112:0x020c, code lost:
            
                r25 = r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:113:0x02c7, code lost:
            
                r6 = r6.a(r7);
             */
            /* JADX WARN: Code restructure failed: missing block: B:114:0x02cb, code lost:
            
                r24.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:115:0x02d0, code lost:
            
                if (r6.d != false) goto L121;
             */
            /* JADX WARN: Code restructure failed: missing block: B:116:0x02d4, code lost:
            
                r1 = r25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:118:0x020a, code lost:
            
                r7 = defpackage.qch.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:119:0x0212, code lost:
            
                ((defpackage.alwl) ((defpackage.alwl) defpackage.qci.a.d()).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/ParticipantsGroupMetadataProcessor", "removeParticipantFromGroup", 403, "ParticipantsGroupMetadataProcessor.java")).q("Participant successfully removed from the conversation.");
             */
            /* JADX WARN: Code restructure failed: missing block: B:120:0x0233, code lost:
            
                if (r2.j.d.equals(r10.O()) == false) goto L94;
             */
            /* JADX WARN: Code restructure failed: missing block: B:121:0x0235, code lost:
            
                ((defpackage.alwl) ((defpackage.alwl) defpackage.qci.a.g()).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/ParticipantsGroupMetadataProcessor", "removeParticipantFromGroup", 411, "ParticipantsGroupMetadataProcessor.java")).q("Skipping inserting tombstone for removing the self user.");
                r7 = defpackage.qch.b;
             */
            /* JADX WARN: Code restructure failed: missing block: B:123:0x0253, code lost:
            
                if (defpackage.aczt.d() == false) goto L104;
             */
            /* JADX WARN: Code restructure failed: missing block: B:125:0x0259, code lost:
            
                if ((r9.b & 1) == 0) goto L104;
             */
            /* JADX WARN: Code restructure failed: missing block: B:126:0x025b, code lost:
            
                r13 = r9.c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:127:0x025d, code lost:
            
                if (r13 != null) goto L101;
             */
            /* JADX WARN: Code restructure failed: missing block: B:128:0x025f, code lost:
            
                r13 = defpackage.qei.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:130:0x026b, code lost:
            
                if (r13.d.equals(r10.O()) != false) goto L104;
             */
            /* JADX WARN: Code restructure failed: missing block: B:131:0x026d, code lost:
            
                r19 = 221;
             */
            /* JADX WARN: Code restructure failed: missing block: B:133:0x0280, code lost:
            
                if (r2.j.d.equals(r10.O()) != false) goto L115;
             */
            /* JADX WARN: Code restructure failed: missing block: B:134:0x0282, code lost:
            
                r13 = (defpackage.ujv) r4.d.b();
                r14 = j$.util.Optional.empty();
                r15 = r2.a;
                r25 = r1;
                r1 = r2.n;
                r18 = defpackage.alog.r(r10);
             */
            /* JADX WARN: Code restructure failed: missing block: B:135:0x029e, code lost:
            
                if ((r9.b & 2) == 0) goto L113;
             */
            /* JADX WARN: Code restructure failed: missing block: B:136:0x02a0, code lost:
            
                r9 = r9.d;
             */
            /* JADX WARN: Code restructure failed: missing block: B:137:0x02a2, code lost:
            
                if (r9 != null) goto L112;
             */
            /* JADX WARN: Code restructure failed: missing block: B:138:0x02a4, code lost:
            
                r9 = defpackage.apct.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:139:0x02a6, code lost:
            
                r9 = defpackage.apds.a(r9);
             */
            /* JADX WARN: Code restructure failed: missing block: B:140:0x02b5, code lost:
            
                r13.h(r14, r15, r1, r7, r18, r19, r9, -1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:141:0x02c5, code lost:
            
                r7 = defpackage.qch.b;
             */
            /* JADX WARN: Code restructure failed: missing block: B:142:0x02ab, code lost:
            
                r9 = r4.e.f().toEpochMilli();
             */
            /* JADX WARN: Code restructure failed: missing block: B:143:0x02c1, code lost:
            
                r25 = r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:144:0x0272, code lost:
            
                r19 = 201;
             */
            /* JADX WARN: Code restructure failed: missing block: B:146:0x02d8, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:157:0x02e4, code lost:
            
                r1 = r3.d.iterator();
             */
            /* JADX WARN: Code restructure failed: missing block: B:159:0x02ee, code lost:
            
                if (r1.hasNext() == false) goto L207;
             */
            /* JADX WARN: Code restructure failed: missing block: B:160:0x02f0, code lost:
            
                r3 = (defpackage.qgy) r1.next();
                r7 = r3.c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:161:0x02f8, code lost:
            
                if (r7 != null) goto L136;
             */
            /* JADX WARN: Code restructure failed: missing block: B:162:0x02fa, code lost:
            
                r7 = defpackage.qei.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:163:0x02fc, code lost:
            
                r7 = r4.b(r8, r7);
                r9 = r3.c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:164:0x0302, code lost:
            
                if (r9 != null) goto L139;
             */
            /* JADX WARN: Code restructure failed: missing block: B:165:0x0304, code lost:
            
                r9 = defpackage.qei.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:166:0x0306, code lost:
            
                r10 = r3.e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:167:0x0308, code lost:
            
                if (r10 != null) goto L142;
             */
            /* JADX WARN: Code restructure failed: missing block: B:168:0x030a, code lost:
            
                r10 = defpackage.qfm.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:169:0x030c, code lost:
            
                r9 = defpackage.qci.d(r7, r4.c(r8, r9, r10, r2), "update");
             */
            /* JADX WARN: Code restructure failed: missing block: B:171:0x0316, code lost:
            
                r3 = defpackage.qfe.b(r3.d);
             */
            /* JADX WARN: Code restructure failed: missing block: B:172:0x031c, code lost:
            
                if (r3 != null) goto L146;
             */
            /* JADX WARN: Code restructure failed: missing block: B:173:0x031e, code lost:
            
                r3 = defpackage.qfe.UNKNOWN_STATE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:176:0x0339, code lost:
            
                if (((defpackage.rtz) r4.c.b()).aj(r2.a, r7.M(), new defpackage.rux(r3)) != false) goto L150;
             */
            /* JADX WARN: Code restructure failed: missing block: B:177:0x033b, code lost:
            
                ((defpackage.alwl) ((defpackage.alwl) defpackage.qci.a.i()).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/ParticipantsGroupMetadataProcessor", "updateParticipantInGroup", 459, "ParticipantsGroupMetadataProcessor.java")).q("Participant not successfully updated in the conversation.");
                r3 = defpackage.qch.c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:178:0x036a, code lost:
            
                r6 = r6.a(r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:179:0x036e, code lost:
            
                r9.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:180:0x0373, code lost:
            
                if (r6.d != false) goto L209;
             */
            /* JADX WARN: Code restructure failed: missing block: B:183:0x0353, code lost:
            
                ((defpackage.alwl) ((defpackage.alwl) defpackage.qci.a.d()).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/ParticipantsGroupMetadataProcessor", "updateParticipantInGroup", 463, "ParticipantsGroupMetadataProcessor.java")).q("Participant successfully updated in the conversation.");
                r3 = defpackage.qch.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:185:0x0376, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:188:0x0378, code lost:
            
                r9.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:190:?, code lost:
            
                throw r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:191:0x037c, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:193:0x037e, code lost:
            
                r0.addSuppressed(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:194:0x0381, code lost:
            
                throw r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:92:0x0199, code lost:
            
                r1 = r3.c.iterator();
             */
            /* JADX WARN: Code restructure failed: missing block: B:94:0x01a3, code lost:
            
                if (r1.hasNext() == false) goto L205;
             */
            /* JADX WARN: Code restructure failed: missing block: B:95:0x01a5, code lost:
            
                r7 = (defpackage.qfw) r1.next();
                r9 = r7.d;
             */
            /* JADX WARN: Code restructure failed: missing block: B:96:0x01ad, code lost:
            
                if (r9 != null) goto L76;
             */
            /* JADX WARN: Code restructure failed: missing block: B:97:0x01af, code lost:
            
                r9 = defpackage.qfm.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:98:0x01b1, code lost:
            
                r10 = r7.c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:99:0x01b3, code lost:
            
                if (r10 != null) goto L79;
             */
            @Override // defpackage.algk
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object apply(java.lang.Object r29) {
                /*
                    Method dump skipped, instructions count: 961
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.qce.apply(java.lang.Object):java.lang.Object");
            }
        }, this.b).i(new qcf(this, f, qflVar, conversationIdType, qfgVar2, 0), this.b);
    }

    public final ParticipantsTable.BindData b(Set set, qei qeiVar) {
        tap e = e(qeiVar.d);
        f(set, e);
        return e.a();
    }

    public final ParticipantsTable.BindData c(Set set, qei qeiVar, qfm qfmVar, qbs qbsVar) {
        qei qeiVar2;
        String str = qeiVar.d;
        if ((qfmVar.b & 1) != 0) {
            qei qeiVar3 = qfmVar.c;
            if (qeiVar3 == null) {
                qeiVar2 = qei.a;
            } else {
                qeiVar2 = qeiVar3;
            }
            String str2 = qeiVar2.d;
            if (qeiVar3 == null) {
                qeiVar3 = qei.a;
            }
            if (!qeiVar3.equals(qbsVar.j)) {
                str = str2;
            } else {
                ParticipantsTable.BindData a2 = ((rxq) this.i.b()).a(((SelfIdentityIdImpl) qbsVar.k).a);
                a2.getClass();
                return a2;
            }
        }
        tap e = e(str);
        f(set, e);
        return e.a();
    }
}
