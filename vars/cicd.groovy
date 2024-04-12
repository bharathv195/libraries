def newGit(repo)
{
   git branch: 'master', url: "${repo}"
}
def newMaven()
{
   sh "mvn clean package
}
