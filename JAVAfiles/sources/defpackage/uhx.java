package defpackage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uhx extends ContentProvider {
    private static final xze a = xze.g("Bugle", "SharedStorageProvider");

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        void OB();

        ahmn Rx();

        uhv dM();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(11:6|(2:7|8)|(1:10)(2:46|(1:48)(2:49|(1:51)(5:52|(1:54)(3:500|8b|(1:509))|55|56|(2:58|(5:60|(3:64|65|(2:67|(1:(1:70)(2:71|(1:73)(2:74|(1:76)(1:77))))(2:(3:82|83|(1:(1:(2:90|(1:92)(3:93|94|(4:96|(2:100|(1:(2:103|104)(1:105))(1:106))|107|(0)(0))(4:108|(2:110|(0)(0))|107|(0)(0))))(3:111|112|(4:114|(2:118|(1:(2:121|122)(3:123|(1:125)(1:127)|126))(1:128))|129|(0)(0))(4:130|(2:132|(0)(0))|129|(0)(0))))(3:133|134|(2:136|(4:138|(2:142|(1:(1:(2:146|147)(6:148|149|150|(1:152)(1:156)|153|154))(7:158|(4:160|161|162|163)(2:166|(4:168|169|170|163)(2:173|(5:175|176|177|178|163)(2:181|(3:240|241|163)(5:183|(4:188|189|(1:(1:(2:196|(2:198|(1:(1:201)(2:202|203))(2:206|207))(2:210|211))(2:214|215))(1:218))(1:219)|163)|236|237|163))))|515|516|517|518|520))(1:244))|245|(0)(0))(4:246|(2:248|(0)(0))|245|(0)(0)))(4:249|(2:251|(0)(0))|245|(0)(0))))(3:252|253|(4:255|(2:259|(1:(2:262|263)(3:264|(1:266)(1:268)|267))(1:269))|270|(0)(0))(4:271|(2:273|(0)(0))|270|(0)(0))))|284))(1:(1:286)(4:287|288|292|(1:(1:(2:296|(1:298)(3:299|300|(2:302|(4:304|(2:308|(1:(1:(2:312|313)(1:314))(3:315|(1:317)(1:319)|318))(1:320))|321|(0)(0))(4:322|(2:324|(0)(0))|321|(0)(0)))(4:325|(2:327|(0)(0))|321|(0)(0))))(3:328|329|(4:331|(2:335|(1:(2:338|339)(3:340|(1:342)(1:344)|343))(1:345))|346|(0)(0))(4:347|(2:349|(0)(0))|346|(0)(0))))(4:350|351|(2:356|(1:(2:359|(2:361|(1:363)(2:365|(1:367)(1:368)))(2:369|(1:371)(1:372)))(3:373|(1:375)(1:377)|376))(2:378|(1:380)(3:381|(2:386|(1:388)(2:389|(1:391)(2:392|(1:394)(3:395|396|(1:(1:(2:403|(1:405)(1:406))(1:407))(1:408))(1:409)))))|420)))(1:421)|364))(3:435|436|(1:(1:(2:443|(2:445|(2:447|448)(3:449|(1:451)(1:453)|452))(2:454|(1:456)(2:457|(1:459)(1:460))))(2:461|(1:463)(1:464)))(2:465|(1:467)(1:468)))(1:469)))))|493|65|(0)(0))(5:494|(3:496|65|(0)(0))|493|65|(0)(0)))(5:497|(3:499|65|(0)(0))|493|65|(0)(0)))))|11|(6:32|(1:34)(1:44)|35|36|19|20)(1:13)|14|(5:16|17|18|19|20)|23|24|19|20) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:183|(4:188|189|(1:(1:(2:196|(2:198|(1:(1:201)(2:202|203))(2:206|207))(2:210|211))(2:214|215))(1:218))(1:219)|163)|236|237|163) */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x05fd, code lost:
    
        r1 = defpackage.aktp.af(new java.lang.IllegalArgumentException("Invalid ProvisioningSuccessData proto"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0c9f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0ca3, code lost:
    
        if ((r0 instanceof java.lang.InterruptedException) != false) goto L509;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0ca5, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0cac, code lost:
    
        defpackage.uhx.a.r("Call to Future inside SharedStorageProvider BinderThread failed: ", r0);
        r1 = new android.os.Bundle();
        r1.putInt("result_error_key", 7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0c5d, code lost:
    
        if (r2.startsWith("AsyncTask #") == false) goto L497;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0220 A[Catch: all -> 0x0cc6, TryCatch #2 {all -> 0x0cc6, blocks: (B:8:0x0033, B:10:0x003f, B:11:0x0c32, B:14:0x0c88, B:17:0x0c8e, B:24:0x0c96, B:28:0x0ca1, B:30:0x0ca5, B:31:0x0cac, B:32:0x0c4e, B:36:0x0c5f, B:40:0x0c6a, B:42:0x0c6e, B:43:0x0c75, B:44:0x0c57, B:46:0x004c, B:48:0x005e, B:49:0x0064, B:51:0x006b, B:52:0x0071, B:55:0x00b9, B:70:0x00f8, B:71:0x0112, B:73:0x011a, B:74:0x0130, B:76:0x0138, B:77:0x0163, B:79:0x016c, B:82:0x0176, B:92:0x01b0, B:93:0x01c9, B:104:0x01f8, B:105:0x01fe, B:106:0x0220, B:111:0x0236, B:122:0x0265, B:123:0x026b, B:125:0x027b, B:126:0x02a1, B:127:0x0296, B:128:0x02af, B:133:0x02c5, B:147:0x0307, B:148:0x030d, B:150:0x0315, B:152:0x031d, B:154:0x036d, B:156:0x033f, B:157:0x0362, B:158:0x037c, B:160:0x038c, B:162:0x0394, B:163:0x0608, B:165:0x03a2, B:166:0x03af, B:168:0x03b7, B:170:0x03bf, B:172:0x03cd, B:173:0x03da, B:175:0x03e2, B:177:0x040e, B:178:0x0416, B:180:0x044c, B:181:0x0459, B:241:0x0461, B:183:0x047c, B:185:0x0484, B:188:0x048e, B:201:0x04e1, B:203:0x04ee, B:205:0x0511, B:207:0x051e, B:209:0x0540, B:211:0x054d, B:213:0x0570, B:215:0x057d, B:217:0x059e, B:218:0x05aa, B:219:0x05c4, B:237:0x05dc, B:239:0x05fd, B:243:0x046f, B:244:0x0616, B:252:0x062c, B:263:0x065b, B:264:0x0661, B:266:0x0671, B:267:0x0694, B:268:0x0689, B:269:0x06a3, B:284:0x06b9, B:286:0x06c1, B:287:0x06c7, B:298:0x0703, B:299:0x071c, B:313:0x075c, B:314:0x0762, B:315:0x0782, B:317:0x0794, B:318:0x07d0, B:319:0x07a9, B:320:0x07ea, B:328:0x0806, B:339:0x0835, B:340:0x083b, B:342:0x084b, B:343:0x0866, B:344:0x085b, B:345:0x0873, B:350:0x088f, B:363:0x08de, B:364:0x0af3, B:365:0x08ea, B:367:0x08fa, B:368:0x090d, B:369:0x093b, B:371:0x0943, B:372:0x0949, B:373:0x0966, B:375:0x0978, B:376:0x09b3, B:377:0x098d, B:378:0x09c1, B:380:0x09d1, B:381:0x09e4, B:383:0x09ec, B:386:0x09f6, B:388:0x09fe, B:389:0x0a11, B:391:0x0a19, B:392:0x0a2a, B:394:0x0a32, B:395:0x0a53, B:405:0x0a8d, B:406:0x0a99, B:407:0x0aaa, B:408:0x0aba, B:409:0x0acc, B:420:0x0ad1, B:421:0x0ae3, B:435:0x0b01, B:448:0x0b4f, B:449:0x0b55, B:451:0x0b65, B:452:0x0b80, B:453:0x0b75, B:454:0x0b8d, B:456:0x0b95, B:457:0x0ba5, B:459:0x0bad, B:460:0x0bbd, B:461:0x0bc4, B:463:0x0bcc, B:464:0x0be7, B:465:0x0bee, B:467:0x0bf6, B:468:0x0c11, B:469:0x0c18, B:500:0x0089, B:501:0x008b, B:509:0x00a0, B:514:0x0cc5, B:503:0x008c, B:505:0x0090, B:506:0x0093, B:507:0x009d), top: B:7:0x0033, inners: #0, #4, #6, #7, #9, #11, #13, #14, #15, #16, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02af A[Catch: all -> 0x0cc6, TryCatch #2 {all -> 0x0cc6, blocks: (B:8:0x0033, B:10:0x003f, B:11:0x0c32, B:14:0x0c88, B:17:0x0c8e, B:24:0x0c96, B:28:0x0ca1, B:30:0x0ca5, B:31:0x0cac, B:32:0x0c4e, B:36:0x0c5f, B:40:0x0c6a, B:42:0x0c6e, B:43:0x0c75, B:44:0x0c57, B:46:0x004c, B:48:0x005e, B:49:0x0064, B:51:0x006b, B:52:0x0071, B:55:0x00b9, B:70:0x00f8, B:71:0x0112, B:73:0x011a, B:74:0x0130, B:76:0x0138, B:77:0x0163, B:79:0x016c, B:82:0x0176, B:92:0x01b0, B:93:0x01c9, B:104:0x01f8, B:105:0x01fe, B:106:0x0220, B:111:0x0236, B:122:0x0265, B:123:0x026b, B:125:0x027b, B:126:0x02a1, B:127:0x0296, B:128:0x02af, B:133:0x02c5, B:147:0x0307, B:148:0x030d, B:150:0x0315, B:152:0x031d, B:154:0x036d, B:156:0x033f, B:157:0x0362, B:158:0x037c, B:160:0x038c, B:162:0x0394, B:163:0x0608, B:165:0x03a2, B:166:0x03af, B:168:0x03b7, B:170:0x03bf, B:172:0x03cd, B:173:0x03da, B:175:0x03e2, B:177:0x040e, B:178:0x0416, B:180:0x044c, B:181:0x0459, B:241:0x0461, B:183:0x047c, B:185:0x0484, B:188:0x048e, B:201:0x04e1, B:203:0x04ee, B:205:0x0511, B:207:0x051e, B:209:0x0540, B:211:0x054d, B:213:0x0570, B:215:0x057d, B:217:0x059e, B:218:0x05aa, B:219:0x05c4, B:237:0x05dc, B:239:0x05fd, B:243:0x046f, B:244:0x0616, B:252:0x062c, B:263:0x065b, B:264:0x0661, B:266:0x0671, B:267:0x0694, B:268:0x0689, B:269:0x06a3, B:284:0x06b9, B:286:0x06c1, B:287:0x06c7, B:298:0x0703, B:299:0x071c, B:313:0x075c, B:314:0x0762, B:315:0x0782, B:317:0x0794, B:318:0x07d0, B:319:0x07a9, B:320:0x07ea, B:328:0x0806, B:339:0x0835, B:340:0x083b, B:342:0x084b, B:343:0x0866, B:344:0x085b, B:345:0x0873, B:350:0x088f, B:363:0x08de, B:364:0x0af3, B:365:0x08ea, B:367:0x08fa, B:368:0x090d, B:369:0x093b, B:371:0x0943, B:372:0x0949, B:373:0x0966, B:375:0x0978, B:376:0x09b3, B:377:0x098d, B:378:0x09c1, B:380:0x09d1, B:381:0x09e4, B:383:0x09ec, B:386:0x09f6, B:388:0x09fe, B:389:0x0a11, B:391:0x0a19, B:392:0x0a2a, B:394:0x0a32, B:395:0x0a53, B:405:0x0a8d, B:406:0x0a99, B:407:0x0aaa, B:408:0x0aba, B:409:0x0acc, B:420:0x0ad1, B:421:0x0ae3, B:435:0x0b01, B:448:0x0b4f, B:449:0x0b55, B:451:0x0b65, B:452:0x0b80, B:453:0x0b75, B:454:0x0b8d, B:456:0x0b95, B:457:0x0ba5, B:459:0x0bad, B:460:0x0bbd, B:461:0x0bc4, B:463:0x0bcc, B:464:0x0be7, B:465:0x0bee, B:467:0x0bf6, B:468:0x0c11, B:469:0x0c18, B:500:0x0089, B:501:0x008b, B:509:0x00a0, B:514:0x0cc5, B:503:0x008c, B:505:0x0090, B:506:0x0093, B:507:0x009d), top: B:7:0x0033, inners: #0, #4, #6, #7, #9, #11, #13, #14, #15, #16, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0616 A[Catch: all -> 0x0cc6, TryCatch #2 {all -> 0x0cc6, blocks: (B:8:0x0033, B:10:0x003f, B:11:0x0c32, B:14:0x0c88, B:17:0x0c8e, B:24:0x0c96, B:28:0x0ca1, B:30:0x0ca5, B:31:0x0cac, B:32:0x0c4e, B:36:0x0c5f, B:40:0x0c6a, B:42:0x0c6e, B:43:0x0c75, B:44:0x0c57, B:46:0x004c, B:48:0x005e, B:49:0x0064, B:51:0x006b, B:52:0x0071, B:55:0x00b9, B:70:0x00f8, B:71:0x0112, B:73:0x011a, B:74:0x0130, B:76:0x0138, B:77:0x0163, B:79:0x016c, B:82:0x0176, B:92:0x01b0, B:93:0x01c9, B:104:0x01f8, B:105:0x01fe, B:106:0x0220, B:111:0x0236, B:122:0x0265, B:123:0x026b, B:125:0x027b, B:126:0x02a1, B:127:0x0296, B:128:0x02af, B:133:0x02c5, B:147:0x0307, B:148:0x030d, B:150:0x0315, B:152:0x031d, B:154:0x036d, B:156:0x033f, B:157:0x0362, B:158:0x037c, B:160:0x038c, B:162:0x0394, B:163:0x0608, B:165:0x03a2, B:166:0x03af, B:168:0x03b7, B:170:0x03bf, B:172:0x03cd, B:173:0x03da, B:175:0x03e2, B:177:0x040e, B:178:0x0416, B:180:0x044c, B:181:0x0459, B:241:0x0461, B:183:0x047c, B:185:0x0484, B:188:0x048e, B:201:0x04e1, B:203:0x04ee, B:205:0x0511, B:207:0x051e, B:209:0x0540, B:211:0x054d, B:213:0x0570, B:215:0x057d, B:217:0x059e, B:218:0x05aa, B:219:0x05c4, B:237:0x05dc, B:239:0x05fd, B:243:0x046f, B:244:0x0616, B:252:0x062c, B:263:0x065b, B:264:0x0661, B:266:0x0671, B:267:0x0694, B:268:0x0689, B:269:0x06a3, B:284:0x06b9, B:286:0x06c1, B:287:0x06c7, B:298:0x0703, B:299:0x071c, B:313:0x075c, B:314:0x0762, B:315:0x0782, B:317:0x0794, B:318:0x07d0, B:319:0x07a9, B:320:0x07ea, B:328:0x0806, B:339:0x0835, B:340:0x083b, B:342:0x084b, B:343:0x0866, B:344:0x085b, B:345:0x0873, B:350:0x088f, B:363:0x08de, B:364:0x0af3, B:365:0x08ea, B:367:0x08fa, B:368:0x090d, B:369:0x093b, B:371:0x0943, B:372:0x0949, B:373:0x0966, B:375:0x0978, B:376:0x09b3, B:377:0x098d, B:378:0x09c1, B:380:0x09d1, B:381:0x09e4, B:383:0x09ec, B:386:0x09f6, B:388:0x09fe, B:389:0x0a11, B:391:0x0a19, B:392:0x0a2a, B:394:0x0a32, B:395:0x0a53, B:405:0x0a8d, B:406:0x0a99, B:407:0x0aaa, B:408:0x0aba, B:409:0x0acc, B:420:0x0ad1, B:421:0x0ae3, B:435:0x0b01, B:448:0x0b4f, B:449:0x0b55, B:451:0x0b65, B:452:0x0b80, B:453:0x0b75, B:454:0x0b8d, B:456:0x0b95, B:457:0x0ba5, B:459:0x0bad, B:460:0x0bbd, B:461:0x0bc4, B:463:0x0bcc, B:464:0x0be7, B:465:0x0bee, B:467:0x0bf6, B:468:0x0c11, B:469:0x0c18, B:500:0x0089, B:501:0x008b, B:509:0x00a0, B:514:0x0cc5, B:503:0x008c, B:505:0x0090, B:506:0x0093, B:507:0x009d), top: B:7:0x0033, inners: #0, #4, #6, #7, #9, #11, #13, #14, #15, #16, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x06a3 A[Catch: all -> 0x0cc6, TryCatch #2 {all -> 0x0cc6, blocks: (B:8:0x0033, B:10:0x003f, B:11:0x0c32, B:14:0x0c88, B:17:0x0c8e, B:24:0x0c96, B:28:0x0ca1, B:30:0x0ca5, B:31:0x0cac, B:32:0x0c4e, B:36:0x0c5f, B:40:0x0c6a, B:42:0x0c6e, B:43:0x0c75, B:44:0x0c57, B:46:0x004c, B:48:0x005e, B:49:0x0064, B:51:0x006b, B:52:0x0071, B:55:0x00b9, B:70:0x00f8, B:71:0x0112, B:73:0x011a, B:74:0x0130, B:76:0x0138, B:77:0x0163, B:79:0x016c, B:82:0x0176, B:92:0x01b0, B:93:0x01c9, B:104:0x01f8, B:105:0x01fe, B:106:0x0220, B:111:0x0236, B:122:0x0265, B:123:0x026b, B:125:0x027b, B:126:0x02a1, B:127:0x0296, B:128:0x02af, B:133:0x02c5, B:147:0x0307, B:148:0x030d, B:150:0x0315, B:152:0x031d, B:154:0x036d, B:156:0x033f, B:157:0x0362, B:158:0x037c, B:160:0x038c, B:162:0x0394, B:163:0x0608, B:165:0x03a2, B:166:0x03af, B:168:0x03b7, B:170:0x03bf, B:172:0x03cd, B:173:0x03da, B:175:0x03e2, B:177:0x040e, B:178:0x0416, B:180:0x044c, B:181:0x0459, B:241:0x0461, B:183:0x047c, B:185:0x0484, B:188:0x048e, B:201:0x04e1, B:203:0x04ee, B:205:0x0511, B:207:0x051e, B:209:0x0540, B:211:0x054d, B:213:0x0570, B:215:0x057d, B:217:0x059e, B:218:0x05aa, B:219:0x05c4, B:237:0x05dc, B:239:0x05fd, B:243:0x046f, B:244:0x0616, B:252:0x062c, B:263:0x065b, B:264:0x0661, B:266:0x0671, B:267:0x0694, B:268:0x0689, B:269:0x06a3, B:284:0x06b9, B:286:0x06c1, B:287:0x06c7, B:298:0x0703, B:299:0x071c, B:313:0x075c, B:314:0x0762, B:315:0x0782, B:317:0x0794, B:318:0x07d0, B:319:0x07a9, B:320:0x07ea, B:328:0x0806, B:339:0x0835, B:340:0x083b, B:342:0x084b, B:343:0x0866, B:344:0x085b, B:345:0x0873, B:350:0x088f, B:363:0x08de, B:364:0x0af3, B:365:0x08ea, B:367:0x08fa, B:368:0x090d, B:369:0x093b, B:371:0x0943, B:372:0x0949, B:373:0x0966, B:375:0x0978, B:376:0x09b3, B:377:0x098d, B:378:0x09c1, B:380:0x09d1, B:381:0x09e4, B:383:0x09ec, B:386:0x09f6, B:388:0x09fe, B:389:0x0a11, B:391:0x0a19, B:392:0x0a2a, B:394:0x0a32, B:395:0x0a53, B:405:0x0a8d, B:406:0x0a99, B:407:0x0aaa, B:408:0x0aba, B:409:0x0acc, B:420:0x0ad1, B:421:0x0ae3, B:435:0x0b01, B:448:0x0b4f, B:449:0x0b55, B:451:0x0b65, B:452:0x0b80, B:453:0x0b75, B:454:0x0b8d, B:456:0x0b95, B:457:0x0ba5, B:459:0x0bad, B:460:0x0bbd, B:461:0x0bc4, B:463:0x0bcc, B:464:0x0be7, B:465:0x0bee, B:467:0x0bf6, B:468:0x0c11, B:469:0x0c18, B:500:0x0089, B:501:0x008b, B:509:0x00a0, B:514:0x0cc5, B:503:0x008c, B:505:0x0090, B:506:0x0093, B:507:0x009d), top: B:7:0x0033, inners: #0, #4, #6, #7, #9, #11, #13, #14, #15, #16, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x07ea A[Catch: all -> 0x0cc6, TryCatch #2 {all -> 0x0cc6, blocks: (B:8:0x0033, B:10:0x003f, B:11:0x0c32, B:14:0x0c88, B:17:0x0c8e, B:24:0x0c96, B:28:0x0ca1, B:30:0x0ca5, B:31:0x0cac, B:32:0x0c4e, B:36:0x0c5f, B:40:0x0c6a, B:42:0x0c6e, B:43:0x0c75, B:44:0x0c57, B:46:0x004c, B:48:0x005e, B:49:0x0064, B:51:0x006b, B:52:0x0071, B:55:0x00b9, B:70:0x00f8, B:71:0x0112, B:73:0x011a, B:74:0x0130, B:76:0x0138, B:77:0x0163, B:79:0x016c, B:82:0x0176, B:92:0x01b0, B:93:0x01c9, B:104:0x01f8, B:105:0x01fe, B:106:0x0220, B:111:0x0236, B:122:0x0265, B:123:0x026b, B:125:0x027b, B:126:0x02a1, B:127:0x0296, B:128:0x02af, B:133:0x02c5, B:147:0x0307, B:148:0x030d, B:150:0x0315, B:152:0x031d, B:154:0x036d, B:156:0x033f, B:157:0x0362, B:158:0x037c, B:160:0x038c, B:162:0x0394, B:163:0x0608, B:165:0x03a2, B:166:0x03af, B:168:0x03b7, B:170:0x03bf, B:172:0x03cd, B:173:0x03da, B:175:0x03e2, B:177:0x040e, B:178:0x0416, B:180:0x044c, B:181:0x0459, B:241:0x0461, B:183:0x047c, B:185:0x0484, B:188:0x048e, B:201:0x04e1, B:203:0x04ee, B:205:0x0511, B:207:0x051e, B:209:0x0540, B:211:0x054d, B:213:0x0570, B:215:0x057d, B:217:0x059e, B:218:0x05aa, B:219:0x05c4, B:237:0x05dc, B:239:0x05fd, B:243:0x046f, B:244:0x0616, B:252:0x062c, B:263:0x065b, B:264:0x0661, B:266:0x0671, B:267:0x0694, B:268:0x0689, B:269:0x06a3, B:284:0x06b9, B:286:0x06c1, B:287:0x06c7, B:298:0x0703, B:299:0x071c, B:313:0x075c, B:314:0x0762, B:315:0x0782, B:317:0x0794, B:318:0x07d0, B:319:0x07a9, B:320:0x07ea, B:328:0x0806, B:339:0x0835, B:340:0x083b, B:342:0x084b, B:343:0x0866, B:344:0x085b, B:345:0x0873, B:350:0x088f, B:363:0x08de, B:364:0x0af3, B:365:0x08ea, B:367:0x08fa, B:368:0x090d, B:369:0x093b, B:371:0x0943, B:372:0x0949, B:373:0x0966, B:375:0x0978, B:376:0x09b3, B:377:0x098d, B:378:0x09c1, B:380:0x09d1, B:381:0x09e4, B:383:0x09ec, B:386:0x09f6, B:388:0x09fe, B:389:0x0a11, B:391:0x0a19, B:392:0x0a2a, B:394:0x0a32, B:395:0x0a53, B:405:0x0a8d, B:406:0x0a99, B:407:0x0aaa, B:408:0x0aba, B:409:0x0acc, B:420:0x0ad1, B:421:0x0ae3, B:435:0x0b01, B:448:0x0b4f, B:449:0x0b55, B:451:0x0b65, B:452:0x0b80, B:453:0x0b75, B:454:0x0b8d, B:456:0x0b95, B:457:0x0ba5, B:459:0x0bad, B:460:0x0bbd, B:461:0x0bc4, B:463:0x0bcc, B:464:0x0be7, B:465:0x0bee, B:467:0x0bf6, B:468:0x0c11, B:469:0x0c18, B:500:0x0089, B:501:0x008b, B:509:0x00a0, B:514:0x0cc5, B:503:0x008c, B:505:0x0090, B:506:0x0093, B:507:0x009d), top: B:7:0x0033, inners: #0, #4, #6, #7, #9, #11, #13, #14, #15, #16, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0873 A[Catch: all -> 0x0cc6, TryCatch #2 {all -> 0x0cc6, blocks: (B:8:0x0033, B:10:0x003f, B:11:0x0c32, B:14:0x0c88, B:17:0x0c8e, B:24:0x0c96, B:28:0x0ca1, B:30:0x0ca5, B:31:0x0cac, B:32:0x0c4e, B:36:0x0c5f, B:40:0x0c6a, B:42:0x0c6e, B:43:0x0c75, B:44:0x0c57, B:46:0x004c, B:48:0x005e, B:49:0x0064, B:51:0x006b, B:52:0x0071, B:55:0x00b9, B:70:0x00f8, B:71:0x0112, B:73:0x011a, B:74:0x0130, B:76:0x0138, B:77:0x0163, B:79:0x016c, B:82:0x0176, B:92:0x01b0, B:93:0x01c9, B:104:0x01f8, B:105:0x01fe, B:106:0x0220, B:111:0x0236, B:122:0x0265, B:123:0x026b, B:125:0x027b, B:126:0x02a1, B:127:0x0296, B:128:0x02af, B:133:0x02c5, B:147:0x0307, B:148:0x030d, B:150:0x0315, B:152:0x031d, B:154:0x036d, B:156:0x033f, B:157:0x0362, B:158:0x037c, B:160:0x038c, B:162:0x0394, B:163:0x0608, B:165:0x03a2, B:166:0x03af, B:168:0x03b7, B:170:0x03bf, B:172:0x03cd, B:173:0x03da, B:175:0x03e2, B:177:0x040e, B:178:0x0416, B:180:0x044c, B:181:0x0459, B:241:0x0461, B:183:0x047c, B:185:0x0484, B:188:0x048e, B:201:0x04e1, B:203:0x04ee, B:205:0x0511, B:207:0x051e, B:209:0x0540, B:211:0x054d, B:213:0x0570, B:215:0x057d, B:217:0x059e, B:218:0x05aa, B:219:0x05c4, B:237:0x05dc, B:239:0x05fd, B:243:0x046f, B:244:0x0616, B:252:0x062c, B:263:0x065b, B:264:0x0661, B:266:0x0671, B:267:0x0694, B:268:0x0689, B:269:0x06a3, B:284:0x06b9, B:286:0x06c1, B:287:0x06c7, B:298:0x0703, B:299:0x071c, B:313:0x075c, B:314:0x0762, B:315:0x0782, B:317:0x0794, B:318:0x07d0, B:319:0x07a9, B:320:0x07ea, B:328:0x0806, B:339:0x0835, B:340:0x083b, B:342:0x084b, B:343:0x0866, B:344:0x085b, B:345:0x0873, B:350:0x088f, B:363:0x08de, B:364:0x0af3, B:365:0x08ea, B:367:0x08fa, B:368:0x090d, B:369:0x093b, B:371:0x0943, B:372:0x0949, B:373:0x0966, B:375:0x0978, B:376:0x09b3, B:377:0x098d, B:378:0x09c1, B:380:0x09d1, B:381:0x09e4, B:383:0x09ec, B:386:0x09f6, B:388:0x09fe, B:389:0x0a11, B:391:0x0a19, B:392:0x0a2a, B:394:0x0a32, B:395:0x0a53, B:405:0x0a8d, B:406:0x0a99, B:407:0x0aaa, B:408:0x0aba, B:409:0x0acc, B:420:0x0ad1, B:421:0x0ae3, B:435:0x0b01, B:448:0x0b4f, B:449:0x0b55, B:451:0x0b65, B:452:0x0b80, B:453:0x0b75, B:454:0x0b8d, B:456:0x0b95, B:457:0x0ba5, B:459:0x0bad, B:460:0x0bbd, B:461:0x0bc4, B:463:0x0bcc, B:464:0x0be7, B:465:0x0bee, B:467:0x0bf6, B:468:0x0c11, B:469:0x0c18, B:500:0x0089, B:501:0x008b, B:509:0x00a0, B:514:0x0cc5, B:503:0x008c, B:505:0x0090, B:506:0x0093, B:507:0x009d), top: B:7:0x0033, inners: #0, #4, #6, #7, #9, #11, #13, #14, #15, #16, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f0  */
    /* JADX WARN: Type inference failed for: r1v103, types: [java.lang.Object, wul] */
    /* JADX WARN: Type inference failed for: r1v108, types: [java.lang.Object, wul] */
    /* JADX WARN: Type inference failed for: r1v289, types: [java.lang.Object, wul] */
    /* JADX WARN: Type inference failed for: r2v197, types: [java.lang.Object, wul] */
    /* JADX WARN: Type inference failed for: r2v199, types: [java.lang.Object, wul] */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle call(java.lang.String r17, java.lang.String r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 3406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uhx.call(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException(String.format("delete not supported: %s", uri));
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new UnsupportedOperationException(String.format("getType not supported: %s", uri));
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException(String.format("insert not supported: %s", uri));
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException(String.format("query not supported: %s", uri));
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException(String.format("update not supported: %s", uri));
    }
}
