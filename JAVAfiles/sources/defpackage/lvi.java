package defpackage;

import android.util.Base64;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lvi implements uvn {
    public final armf a;
    private final armf b;
    private final arwe c;

    public lvi(armf armfVar, arwe arweVar, armf armfVar2) {
        armfVar.getClass();
        arweVar.getClass();
        this.b = armfVar;
        this.c = arweVar;
        this.a = armfVar2;
    }

    private static final String f(luq luqVar) {
        Instant instant;
        Instant instant2;
        String encodeToString = Base64.encodeToString(yyb.bZ(luqVar.a), 2);
        String name = luqVar.b.name();
        String name2 = luqVar.c.name();
        Instant truncatedTo = luqVar.d.truncatedTo(ChronoUnit.SECONDS);
        Instant instant3 = luqVar.e;
        String str = null;
        if (instant3 != null) {
            instant = instant3.truncatedTo(ChronoUnit.SECONDS);
        } else {
            instant = null;
        }
        lwp lwpVar = luqVar.f;
        if (lwpVar != null) {
            String str2 = lwpVar.d;
            apct apctVar = lwpVar.e;
            if (apctVar == null) {
                apctVar = apct.a;
            }
            aozy builder = apctVar.toBuilder();
            if (!builder.b.isMutable()) {
                builder.u();
            }
            ((apct) builder.b).c = 0;
            apag s = builder.s();
            s.getClass();
            instant2 = instant;
            str = "backupId: [" + str2 + "], backupTimestamp: [" + aoue.m((apct) s) + ", schemaVersion: [" + lwpVar.c + "], minBackupSchemaVersion: [" + lwpVar.f + "], restoreWorkflowVersion: [" + lwpVar.g + "]";
        } else {
            instant2 = instant;
        }
        return "{sessionId = [" + luqVar.a + "], sessionId64 = [" + encodeToString + "], feature = [" + name + "], status = [" + name2 + "], startTime = [" + truncatedTo + "], finishTime = [" + instant2 + "], dbMetaData = [" + str + "]";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057 A[LOOP:0: B:11:0x0051->B:13:0x0057, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.arpe r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.lvf
            if (r0 == 0) goto L13
            r0 = r6
            lvf r0 = (defpackage.lvf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lvf r0 = new lvf
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.StringBuilder r0 = r0.d
            defpackage.aqil.P(r6)
            goto L4b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.aqil.P(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = "Section: RestoreWorkflow\n"
            r6.append(r2)
            r0.d = r6
            r0.c = r3
            java.lang.Object r0 = r5.e(r0)
            if (r0 == r1) goto L86
            r4 = r0
            r0 = r6
            r6 = r4
        L4b:
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r6 = r6.iterator()
        L51:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L7e
            java.lang.Object r1 = r6.next()
            uvm r1 = (defpackage.uvm) r1
            java.lang.String r2 = r1.a
            java.lang.String r1 = r1.b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = ": "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = "\n"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.append(r1)
            goto L51
        L7e:
            java.lang.String r6 = r0.toString()
            r6.getClass()
            return r6
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lvi.a(arpe):java.lang.Object");
    }

    @Override // defpackage.uvn
    public final akul b() {
        akul c;
        c = qjh.c(this.c, arpj.a, arwf.a, new lgp(this, (arpe) null, 9));
        return c;
    }

    @Override // defpackage.uvn
    public final /* synthetic */ akul c() {
        return uvl.c();
    }

    @Override // defpackage.uvn
    public final akul d() {
        akul c;
        c = qjh.c(this.c, arpj.a, arwf.a, new lgp(this, (arpe) null, 10, (byte[]) null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0136 A[LOOP:0: B:12:0x0130->B:14:0x0136, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8 A[LOOP:1: B:23:0x00b2->B:25:0x00b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.arpe r18) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lvi.e(arpe):java.lang.Object");
    }
}
