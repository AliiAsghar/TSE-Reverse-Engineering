package com.google.android.libraries.subscriptions.restore;

import android.content.Context;
import android.provider.Telephony;
import com.google.android.libraries.subscriptions.restore.IG1Restore;
import defpackage.aiyf;
import defpackage.aiyg;
import defpackage.aiyh;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class G1Restore extends IG1Restore.Stub {
    private final Context a;
    private final aiyh b;
    private final aiyg c;

    public G1Restore(Context context, aiyh aiyhVar, aiyg aiygVar) {
        this.a = context;
        this.b = aiyhVar;
        this.c = aiygVar;
    }

    public static aiyg defaultConfig() {
        return new aiyf();
    }

    /* renamed from: lambda$requestRestore$0$com-google-android-libraries-subscriptions-restore-G1Restore, reason: not valid java name */
    public /* synthetic */ boolean m266x29d62010() {
        Context context = this.a;
        return d.B(Telephony.Sms.getDefaultSmsPackage(context), context.getPackageName());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:273|274|275|276|277|(4:(4:(4:(6:(18:(3:440|441|(1:(7:443|(3:462|463|(5:465|(3:466|(2:(1:469)|470)|471)|(1:447)|(1:449)(1:461)|(1:457)(5:453|454|455|456|406)))|445|(0)|(0)(0)|(1:451)|457)))|307|308|(5:310|311|312|313|(1:315))(1:409)|316|317|(4:319|320|(3:322|323|324)(17:326|327|328|329|(2:331|332)|333|334|335|336|337|338|339|340|(1:342)|(1:344)|345|346)|325)|387|388|(1:390)(1:407)|391|(1:393)|394|(3:396|(3:398|399|400)(1:402)|401)|403|404|405|406)|294|295|(6:297|298|299|300|301|302)(2:422|423)|303|(2:305|306)(1:412))|291|292|293)|288|289|290)|285|286|287)|(1:280)|281|282|283|284) */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0901, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0902, code lost:
    
        r9 = r17;
        r12 = r18;
        r13 = r19;
        r21 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0912, code lost:
    
        r2 = r0;
        r9 = r9;
        r13 = r13;
        r21 = r21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:447:0x062e A[Catch: all -> 0x0660, TryCatch #0 {all -> 0x0660, blocks: (B:441:0x05bb, B:443:0x05c1, B:447:0x062e, B:451:0x0640, B:457:0x0655, B:461:0x0635, B:480:0x0629, B:486:0x0626, B:479:0x0620, B:463:0x05f7, B:466:0x05ff, B:469:0x0608, B:470:0x060e, B:471:0x0617), top: B:440:0x05bb, outer: #1, inners: #6, #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0635 A[Catch: all -> 0x0660, TryCatch #0 {all -> 0x0660, blocks: (B:441:0x05bb, B:443:0x05c1, B:447:0x062e, B:451:0x0640, B:457:0x0655, B:461:0x0635, B:480:0x0629, B:486:0x0626, B:479:0x0620, B:463:0x05f7, B:466:0x05ff, B:469:0x0608, B:470:0x060e, B:471:0x0617), top: B:440:0x05bb, outer: #1, inners: #6, #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:540:0x09d4 A[Catch: IOException -> 0x09f2, TRY_LEAVE, TryCatch #10 {IOException -> 0x09f2, blocks: (B:37:0x01ec, B:538:0x09d0, B:540:0x09d4, B:556:0x09c8), top: B:36:0x01ec }] */
    /* JADX WARN: Removed duplicated region for block: B:546:0x09e4  */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v53 */
    /* JADX WARN: Type inference failed for: r13v54 */
    /* JADX WARN: Type inference failed for: r13v55 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v72, types: [android.content.ContentResolver] */
    /* JADX WARN: Type inference failed for: r1v83, types: [android.content.ContentValues] */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v17 */
    /* JADX WARN: Type inference failed for: r21v18 */
    /* JADX WARN: Type inference failed for: r21v19 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5, types: [long] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Readable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v97, types: [android.content.ContentResolver] */
    /* JADX WARN: Type inference failed for: r4v66, types: [android.content.ContentResolver] */
    /* JADX WARN: Type inference failed for: r4v78, types: [android.content.ContentValues] */
    /* JADX WARN: Type inference failed for: r9v13, types: [android.util.JsonReader] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19, types: [android.util.JsonReader] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v32, types: [android.content.ContentValues] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v50 */
    /* JADX WARN: Type inference failed for: r9v51 */
    /* JADX WARN: Type inference failed for: r9v8, types: [akyr] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.libraries.subscriptions.restore.IG1Restore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int requestRestore(android.net.Uri r35, android.net.Uri r36, android.net.Uri r37) {
        /*
            Method dump skipped, instructions count: 2712
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.subscriptions.restore.G1Restore.requestRestore(android.net.Uri, android.net.Uri, android.net.Uri):int");
    }
}
