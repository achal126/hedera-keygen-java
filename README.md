# Description
This project provides a command line level utility for generating ED25519 key pairs for use with Hedera Hashgraph.
A new private/public key pair can be generated from a system-generated random seed or a user-provided seed.
It is also possible to recover an existing keypair from a recovery word list, see examples below.

The .jar file can be found in the ```target``` folder of this project.

The project was developed under Java version 10.

# Invoking the utility
The utility is a Java .jar file which is invoked as follows
```java -jar sdk-keygen-1.0.jar``` followed by optional parameters

# Examples
## Generate a new ED25519 key pair

```java -jar sdk-keygen-1.0.jar```

**Outputs**

Your key pair is:

Public key:302a300506032b6570032100c524ba740fe0dc66a777ea3449b92f1460e5a52fc791b2f2f60f45ef4374d6ca

Secret key:302e020100300506032b657004220420532f40994983eb3da5cbf177fb62e7478bbcd40c91d2b1671a2b64df1a9f755c

Recovery word list:

[void, ace, nice, pick, plea, about, dean, list, far, bench, flair, alone, serene, attach, spiky, target, mania, devour, hoard, climb, all, forbid]

## Generate a new ED25519 key pair from a supplied seed
*Note, the same seed always returns the same key pair. The seed must be 32 digits.*

```java -jar sdk-keygen-1.0.jar 01234567890123456789012345678901```

**Outputs**

Your key pair is:

Public key:302a300506032b65700321002836a6e37ad02dbaee1b37c466b2ef91e593a2e77051a8ab05d21a492846d4da

Secret key:302e020100300506032b6570042204207c58cb49897700f4ca89c86cf23f23a65f33a75210fa6baf05a40728dcecb44c

Recovery word list:

[moss, boast, namely, ever, nobody, Korea, offend, anyway, mutant, defect, never, Henry, oasis, obtain, muck, chord, nearer, furry, notify, meal, moss, bonnet]

## Recover a key pair from the supplied word list.
*Note, the list must be 22 words long, separated by spaces. If the word list is incorrect, an error may be raised.*

```java -jar sdk-keygen-1.0.jar moss boast namely ever nobody Korea offend anyway mutant defect never Henry oasis obtain muck chord nearer furry notify meal moss bonnet```

**Outputs**

Your recovered key pair is:

Public key:302a300506032b65700321002836a6e37ad02dbaee1b37c466b2ef91e593a2e77051a8ab05d21a492846d4da

Secret key:302e020100300506032b6570042204207c58cb49897700f4ca89c86cf23f23a65f33a75210fa6baf05a40728dcecb44c

## Note about compatibility with the Hedera Wallet
Key recovery isn't designed to enable a wallet-generated key to be recovered with this utility, please use the wallet application to recover a key generated in the wallet application.